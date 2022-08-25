package com.practice.dao;

import java.util.ArrayList;
import java.util.List;

import com.practice.model.UserModel;

public class UserDao {

	private static List<UserModel> users = new ArrayList<UserModel>();

	public static int getNextId() {
		return users == null ? 1 : users.size() + 1;
	}

	public static boolean save(UserModel user) {
		users.add(user);
		return true;
	}

	public static int getTotalUser() {
		return users.size();
	}

	public static UserModel getUserById(int id) {
		for(UserModel user : users) {
			// Tìm thấy user có id tương ứng.
			if(user.getId() == id) {
				return user;
			}
		}
		// Không tìm thấy User.
		return null;
	}
}
