package com.practice.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.practice.config.ConnectDatabase;
import com.practice.model.UserModel;

public class UserDao {

	private static List<UserModel> users = new ArrayList<UserModel>();

	public static int getNextId() {
		return users == null ? 1 : users.size() + 1;
	}

	public static boolean save(UserModel user) {
		return users.add(user);
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
	
	
	private UserModel convertToUser(ResultSet rs) throws SQLException{
		UserModel user = new UserModel();
			user.setId(rs.getInt(1));
			user.setFullName(rs.getString(2));
			user.setAge(rs.getInt(3));
			user.setAddress(rs.getString(4));
		return user;
	}
	
	
	//get all user
		public ArrayList<UserModel> getAllUser(){
			Connection connection = null;
			ResultSet resultSet = null;
			Statement statement = null;
			ArrayList<UserModel> userList = new ArrayList<UserModel>();
			String sql = "SELECT * FROM users";
			try {
				connection = ConnectDatabase.getConnection();
				statement = connection.createStatement();
				resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
					userList.add(convertToUser(resultSet));
				}
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			finally {
				if(resultSet != null) {
					try {
						resultSet.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
				if(statement != null) {
					try {
						statement.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
				if(connection != null) {
					try {
						connection.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
			return userList;
		}
}
