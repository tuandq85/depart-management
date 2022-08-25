package com.practice.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.dao.UserDao;
import com.practice.model.UserModel;

public class RegisterUserServlet extends HttpServlet {

	private static final long serialVersionUID = 4964658888733506736L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullName = request.getParameter("fullName");
		int age = 0;
		try {
			age = Integer.parseInt(request.getParameter("age"));
		} catch (Exception e) {
			age = 0;
		}

		String address = request.getParameter("address");

		UserModel user = new UserModel();
		user.setId(UserDao.getNextId());
		user.setFullName(fullName);
		user.setAge(age);
		user.setAddress(address);
		UserDao.save(user);

		System.out.println("Total user: " + UserDao.getTotalUser());
		request.getRequestDispatcher("/view/users/list.jsp").forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/view/users/register.jsp").forward(request, response);
	}
}
