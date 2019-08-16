package com.connection;
import java.sql.*;
class Connection_Test 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ravi_db","root","tiger");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee1");
		while(rs.next())
		{
		
			System.out.println("java");
		}
	}

}
