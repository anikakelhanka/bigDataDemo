package model;

import java.util.ArrayList;

import pojo.User;

public class LoginHandler {

	public ArrayList<User> getLoginStatus(String username, String password) {
		try {
			ArrayList<User> userList = new DatabaseManager().getAllUsers();

			for (User user : userList) {
				if (user.getUsername().equals(username)
						&& user.getPassword().equals(password)) {
					{
						return userList;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("error");
		}

		return null;
		// return "You are not a Valid User";
	}

}