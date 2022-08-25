package com.practice.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInfoServlet extends HttpServlet {

	private static final long serialVersionUID = 9142792065776385787L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = String.valueOf(request.getParameter("username"));
		String password = String.valueOf(request.getParameter("password"));
		System.out.println("password: " + password);

		request.getSession().setAttribute("usr", username);
		request.getRequestDispatcher("/view/login-info.jsp").forward(request, response);
	}
}
