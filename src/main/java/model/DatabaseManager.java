package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import pojo.User;
import dao.DBConnectionManager;

public class DatabaseManager {

	public ArrayList<User> getAllUsers() throws Exception {

		Connection connection = null;
		try {

			connection = DBConnectionManager.getInstance().getConnection();

			PreparedStatement ps = connection
					.prepareStatement("SELECT * FROM user");

			ResultSet rs = ps.executeQuery();

			ArrayList<User> userList = new ArrayList<User>();

			while (rs.next()) {
				User user = new User();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				userList.add(user);
			}

			return userList;

		} catch (Exception e) {
			throw e;
		} finally {
			if (connection != null)
				connection.close();
		}
	}

	public ArrayList<User> addUser(String name, String password)
			throws Exception {

		ArrayList<User> userList = null;
		try {
			Connection connection = DBConnectionManager.getInstance()
					.getConnection();

			String sql = "INSERT INTO user (username, id, password) values (?, ?, ?)";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setInt(2, (int) (Math.random() * 1000));
			statement.setString(3, password);
			statement.executeUpdate();

			connection.close();

		} catch (Exception e) {
			throw e;
		}
		return userList;
	}

}