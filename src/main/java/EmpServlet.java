

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class EmpServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out= response.getWriter();
	String eno=request.getParameter("eno");
	String ename=request.getParameter("ename");
	String salary=request.getParameter("salary");
	out.println("<table border>");
	out.println("<tr><th>Emp num</th/><td>"+eno+"</td></tr>");
	out.println("<tr><th>Emp Name</th><td>"+ename+"</td></tr>");
	out.println("<tr><th>Salary</th><td>"+salary+"</td></tr>");
	out.println("</table>");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
