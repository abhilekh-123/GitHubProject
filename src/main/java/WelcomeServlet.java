import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class WelcomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");//optional
		out.println("Welcome to my  Servlets");
		out.println("<font face=\"arial\" size=\"5\" color=\"blue\">Hello World</font>");
	}
}
