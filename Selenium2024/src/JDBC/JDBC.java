 package JDBC;

/*
 * 1. import java.util
 * 2. Load and Register mysql.java connector file
 * 3. Establish the connection 
 * 4.Create the statement
 * 5.execute the query 
 * 6. Process the query
 * 7.close
 * 
 */
import java.util.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws Exception{
			
		Class.forName("com.mysql.jdbc.Driver");
		
		//give url username pass
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","root");
		
		Statement st = con.createStatement();
		
		//ResultSet rs = st.executeQuery("select * from student");
		
		ResultSet rs = st.executeQuery("select * from student where city = 'Pune'");
		
		
		while(rs.next())
		{
			int id = rs.getInt("Roll_no");
			
			String name = rs.getString("Name");
			
			String city = rs.getString("City");
			
			System.out.println(id+" "+name+" "+ city);
		}

		st.close();
		con.close();
		
		

	}

}
