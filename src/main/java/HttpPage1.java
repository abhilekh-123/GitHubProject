

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HttpPage1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String username= request.getParameter("username");
		HttpSession session=request.getSession();
		session.setAttribute("username",username);
		out.println("<a href=\"/WebProj/HttpPage2\">next page</a>");
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
