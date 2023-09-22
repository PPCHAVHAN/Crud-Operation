import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example4 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trainee","root","root");
			System.out.println("Connection sucessfully");
			Statement stm=con.createStatement();
			
		    int i=stm.executeUpdate("update user set user_id=10 where "
		    		+ "city='nashik'");
		    System.out.println("record updated successfully");
		    
			
		
			
			stm.close();
			con.close();

	}
		
	 catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	}


