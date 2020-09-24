/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.util.Properties;

/**
 *
 * @author Oytun
 */
public class ConnectionPool {

	private static final int POOLSIZE = 10;
	private Connection[] connections;
	private Date[] idleTimes;
	private boolean[] isBusy;
	private Properties info;

	public ConnectionPool() {
		this.connections = new Connection[POOLSIZE];
		this.idleTimes = new Date[POOLSIZE];
		this.isBusy = new boolean[POOLSIZE];

		this.info = new Properties();
		info.put("user", "root");
		info.put("password", "07030607");
	}

	public Connection getConnection() {
		for (int i = 0; i < POOLSIZE; i++) {
			if (!isBusy[i] && connections[i] != null) {
				isBusy[i] = true;
				idleTimes[i] = new Date();
				return connections[i];
			}
		}
		for (int i = 0; i < POOLSIZE; i++) {
			if (connections[i] == null) {
				try {
					connections[i] = createConnection();
					isBusy[i] = true;
					idleTimes[i] = new Date();
					return connections[i];
				} catch (Exception e) {
				}
			}
		}
		return null;
	}

	public Connection createConnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/contact?serverTimezone=UTC";
			Connection dbConnection = DriverManager.getConnection(url, this.info);
			return dbConnection;
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}
}
