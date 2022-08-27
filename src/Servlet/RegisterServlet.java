package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.conf.PropertyDefinitions.DatabaseTerm;
import com.sun.org.apache.xml.internal.serialize.OutputFormat.DTD;

import DT.User;
import model.Usermodel;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet( name = "RegisterServlet" , urlPatterns = { "/register" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("Username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		DT.User user =new User(username, email, password);
		user.setEmail(email);
		System.out.println(":"+email);
		user.setUsername(username);
		System.out.println(":"+username);
		user.setPassword(password);
		System.out.println(":"+password);
		response.sendRedirect(request.getContextPath() + "/list.jsp");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/register");   
		dispatcher.forward(request, response);  
	}

}
