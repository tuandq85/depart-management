package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DepartmentDao;


@WebServlet(name = "DepartmentListServlet" , urlPatterns = { "/departmentlist" })
public class DepartmentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DepartmentListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("departmentList", DepartmentDao.getListDepartments());
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/departmentlist.jsp");       
	       dispatcher.forward(request, response);
	         
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
