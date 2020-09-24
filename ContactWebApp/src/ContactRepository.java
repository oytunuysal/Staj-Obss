/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ContactRepository {
	static ConnectionPool connectionPool = new ConnectionPool();

	public static void createContact(String name, String gsm) {

		// try (Connection dbConnection = connectionPool.getConnection()) {
		//try (Connection dbConnection = BDSConnectionPool.getConnection()) {
		try {
			Connection dbConnection = BDSConnectionPool.getConnection();

			if (dbConnection != null) {
				System.out.println("Successfully connected to MySQL database test");
			}

			Statement statement = dbConnection.createStatement();

			DatabaseMetaData dbm = dbConnection.getMetaData();
			ResultSet tables = dbm.getTables(null, null, "contacts", null);
			if (!tables.next()) {
				statement.executeUpdate("CREATE TABLE contacts (name VARCHAR(15), gsm VARCHAR(15))");
			}
			insert(name, gsm);

		} catch (SQLException ex) {
			System.out.println("An error occurred while connecting MySQL databse");
			ex.printStackTrace();
		}
	}

	public static boolean editNumber(String name, String gsm, String newGsm) {
		// ConnectionPool connectionPool = new ConnectionPool();
		// try (Connection dbConnection = connectionPool.getConnection()) {
		//try (Connection dbConnection = BDSConnectionPool.getConnection()) {
		try {
			Connection dbConnection = BDSConnectionPool.getConnection();
			PreparedStatement preparedStatement = dbConnection
					.prepareStatement("UPDATE contacts SET gsm= ? WHERE name = ?  AND gsm= ?");
			preparedStatement.setString(1, newGsm);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, gsm);
			preparedStatement.execute();
			return true;
		} catch (Exception e) {
			System.err.println(e);
			return false;
		}
	}

	public static void insert(String name, String gsm) {
		try {
			// PreparedStatement preparedStatement = ConnectorSingleton.getInstance()
			// .prepareStatement("INSERT INTO contacts(name,gsm) VALUES (?,?)");
			PreparedStatement preparedStatement = BDSConnectionPool.getConnection()
					.prepareStatement("INSERT INTO contacts(name,gsm) VALUES (?,?)");
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, gsm);
			preparedStatement.execute();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public static ArrayList<Contact> query(String name) {
		// try (Connection dbConnection = connectionPool.getConnection()) {
		//try (Connection dbConnection = BDSConnectionPool.getConnection()) {
		
		try {
			Connection dbConnection = BDSConnectionPool.getConnection();
			ArrayList<Contact> contacts = new ArrayList<Contact>();
			PreparedStatement preparedStatement = dbConnection
					.prepareStatement("SELECT * FROM contact.contacts where name = ?");
			preparedStatement.setString(1, name);
			preparedStatement.execute();
			ResultSet results = preparedStatement.executeQuery();
			results.beforeFirst();
			while (results.next()) {
				contacts.add(new Contact(results.getString("name"), results.getString("gsm")));
			}

			return contacts;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}

	}

	public static void printRs(ResultSet rs) throws SQLException {
		rs.beforeFirst();
		while (rs.next()) {
			String name = rs.getString("name");
			String gsm = rs.getString("gsm");

			System.out.print("name: " + name);
			System.out.println(", gsm: " + gsm);

		}
		System.out.println("");
	}

}
