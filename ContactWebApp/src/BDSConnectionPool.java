import java.sql.Connection;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class BDSConnectionPool {

	private static BasicDataSource ds = new BasicDataSource();

	static {
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/contact?serverTimezone=UTC");
		ds.setUsername("root");
		ds.setPassword("07030607");
		ds.setMinIdle(5);
		ds.setMaxIdle(10);
		ds.setMaxOpenPreparedStatements(10);
	}

	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}

	private BDSConnectionPool() {
	}
}