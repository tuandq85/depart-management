package com.practice.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.dao.UserDao;
import com.practice.model.UserModel;


public class UserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			UserDao userDao = new UserDao();
			ArrayList<UserModel> userList = userDao.getAllUser();
			
			
			request.setAttribute("userList",userList);
		
		request.getRequestDispatcher("/view/users/userlist.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
