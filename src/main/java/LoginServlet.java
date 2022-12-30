import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.swing.JOptionPane;

import java.sql.*;
public class LoginServlet extends HttpServlet {
	Connection con;
	public void init(ServletConfig config)
	{
		String driver = config.getInitParameter("driver");
		String url = config.getInitParameter("url");
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		System.out.println(username);
		System.out.println(password);
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(url,username,password);
			System.out.println(con);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		try {
			PreparedStatement st = con.prepareStatement("select * from users where username='"+username+"' and password='"+password+"'");
			System.out.println(st);
	
			ResultSet rs = st.executeQuery();
			System.out.println(rs);
			if (rs.next())
			{
				System.out.println("1");
				JOptionPane.showMessageDialog(null,"Login Success");
				response.sendRedirect("/WebProj/login.html");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Login Failure");
				RequestDispatcher rd = request.getRequestDispatcher("/RegisterServlet");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			out.println(e);
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	public void destroy()
	{
		try {
			con.close();
		} catch (Exception e) {
			
		}
	}
}
