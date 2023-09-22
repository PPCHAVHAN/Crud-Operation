import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exmaple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trainee","root","root");
			System.out.println("Connection sucessfully");
			Statement stm=con.createStatement();
			stm.executeUpdate("create table user(user_id int,username varchar(20),email varchar(30),city varchar(22))");
			
			int i=stm.executeUpdate("insert into user values(1,'priya','priya@gmail.com','gondiya')");
			i=stm.executeUpdate("insert into user values(2,'pranita','pranita@gmail.com','nashik')");

		    i=stm.executeUpdate("insert into user values(3,'swarali','swarali@gmail.com','nagpur')");
		
			i=stm.executeUpdate("insert into user values(4,'sneha','sneha@gmail.com','goa')");
			System.out.println("record inserted successfully");
			stm.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	}


