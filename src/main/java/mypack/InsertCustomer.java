package mypack;
import java.sql.*;

public class InsertCustomer {
	public static boolean saveCustomer(Customer customer) {
		int n=0;
		String custname =customer.getCustname();
		String username=customer.getUsername();
		String password=customer.getPassword();
		String email=customer.getEmail();
		int age=customer.getAge();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/java","root","root");
		PreparedStatement st=con.prepareStatement("insert into customer values('"+custname+"','"+username+"','"+password+"','"+email+"','"+age+"')");
			n=st.executeUpdate();
	}catch (Exception e){
		System.out.println(e);
	}
		if(n==1)
			return true;
		else
			return false;

	}}
