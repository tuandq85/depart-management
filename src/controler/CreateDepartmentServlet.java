package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DepartmentDao;
import model.Department;


@WebServlet(name = "CreateDepartmentServlet" , urlPatterns = { "/createdepartment" })
public class CreateDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CreateDepartmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/createdepartment.jsp");       
	       dispatcher.forward(request, response);       
	       
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
//		int maphong = Integer.parseInt(request.getParameter("maphong"));		
//	Department checkDepartment = DepartmentDao.getListDepartments(maphong);
		
//		if (checkDepartment ==null) {
//			String tenphong =  request.getParameter("tenphong");
//			String truongphong = request.getParameter("truongphong");
//			
//			
//			Department department = new Department(maphong, tenphong, truongphong);
//			DepartmentDao.insertDepartmen(department);
//			response.sendRedirect(request.getContextPath() + "/departmentlist");
//		}else {
//			response.sendRedirect(request.getContextPath() + "/createdepartment");
//		}
		
		
		String maphong = request.getParameter("maphong");
		String tenphong =  request.getParameter("tenphong");
		String truongphong = request.getParameter("truongphong");
		
		Department department = new Department(maphong, tenphong, truongphong);
		DepartmentDao.insertDepartmen(department);
		
		response.sendRedirect(request.getContextPath() + "/departmentlist");
	}

}
