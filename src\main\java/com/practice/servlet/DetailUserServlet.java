package com.practice.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.dao.UserDao;
import com.practice.model.UserModel;

public class DetailUserServlet extends HttpServlet {

	private static final long serialVersionUID = 809895350688649066L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			if(id <= 0) {
				request.getRequestDispatcher("/view/common/error.jsp").forward(request, response);
			} else {
				UserModel user = UserDao.getUserById(id);
				if(user != null) {
					request.setAttribute("id", user.getId());
					request.setAttribute("fullName", user.getFullName());
					request.setAttribute("age", user.getAge());
					request.setAttribute("address", user.getAddress());
					request.getRequestDispatcher("/view/users/detail.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("/view/common/error.jsp").forward(request, response);
				}
			}
		} catch (Exception e) {
			request.getRequestDispatcher("/view/common/error.jsp").forward(request, response);
		}
		
	}
}
