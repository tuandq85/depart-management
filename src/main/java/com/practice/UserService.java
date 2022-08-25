package com.practice;

import java.util.ArrayList;
import java.util.List;

import com.practice.model.UserModel;

public class UserService {

	private static List<UserModel> users = new ArrayList<UserModel>();

	public List<UserModel> getUsers() {
		return users;
	}

	public boolean addUser(UserModel user) {
		users.add(user);
		return true;
	}
}
