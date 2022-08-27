package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDao;
import DT.User;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet( name = "ListServlet" , urlPatterns = { "/list" })
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Override
    	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	DAO.UserDao user = new UserDao();
    	user.AllUser();
   		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/list.jsp");
           dispatcher.forward(req, resp);
   	}
       @Override
    	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	   System.out.println("Send to another servlet");
    	   String Username = req.getParameter("username");
    	   String email = req.getParameter("email");
    	   String password = req.getParameter("password");
    	   System.out.println("user 2: " + Username);
   		   System.out.println("address 2: " + email);
   		   System.out.println("address 2: " + password);	
    	   req.getRequestDispatcher("/list.jsp").forward(req, resp);
    	}
    	}
	


