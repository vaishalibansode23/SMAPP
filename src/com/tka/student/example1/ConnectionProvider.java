package com.tka.student.example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	static Connection con;
	
	public static Connection createConnection() throws ClassNotFoundException, SQLException
	{
		//load the driver.....
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish the connection......
		String url="jdbc:mysql://localhost:3306/";
		String dbName="Management";
		String uname="root";
		String passWord="root";
		
		con=DriverManager.getConnection(url+dbName, uname, passWord);
		
		return con;
    }
}
