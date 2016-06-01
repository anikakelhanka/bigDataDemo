package service;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import model.LoginHandler;
import pojo.User;

@Path("/Demo")
public class LoginService {

	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ArrayList<User> login(@FormParam("username") String username,
			@FormParam("password") String password) {

		return new LoginHandler().getLoginStatus(username, password);
	}

}