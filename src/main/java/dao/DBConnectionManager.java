package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

	private String connectionUrl;

	public String getConnectionUrl() {
		return connectionUrl;
	}

	public void setConnectionUrl(String connectionUrl) {
		this.connectionUrl = connectionUrl;
	}

	private static DBConnectionManager instance;

	private DBConnectionManager() {
	}

	public static DBConnectionManager getInstance() {

		if (instance == null)
			instance = new DBConnectionManager();

		return instance;

	}

	public Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			return DriverManager.getConnection(connectionUrl, "infoobjects",
					"infoobjects");

		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}
	}

}
