

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;




public class HttpPage2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession session= request.getSession();
		String username=(String) session.getAttribute("username");
		if(username!=null) {
			out.println("welcome "+username);
			
		}else
			response.sendRedirect("WebProj/session.html");
	}

	
	

}
