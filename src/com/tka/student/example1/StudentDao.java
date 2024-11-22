package com.tka.student.example1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudent(StudentInfo st) throws ClassNotFoundException, SQLException
	{
		boolean f=false;
		//jdbc code
		Connection con=ConnectionProvider.createConnection();
		PreparedStatement psmt=con.prepareStatement("insert into StudentInfo(sname,sphone,scity,semail)values(?,?,?,?)");
		
		psmt.setString(1, st.getStudent_name());
		psmt.setString(2, st.getStudent_phone());
		psmt.setString(3, st.getStudent_city());
		psmt.setString(4, st.getStudent_email());
		
		psmt.executeUpdate();
		f=true;
		
		return f;
	}
	public static boolean deleteStudent(int id) throws ClassNotFoundException, SQLException
	{
		boolean f=false;
		//jdbc code
		Connection con=ConnectionProvider.createConnection();
		PreparedStatement psmt=con.prepareStatement("delete from studentinfo where sid=?");
		
		psmt.setInt(1, id);
		psmt.executeUpdate();
		f=true;
		
		return f;
	}
	public static void showStudent() throws SQLException, ClassNotFoundException
	{
	
		//jdbc code
		Connection con=ConnectionProvider.createConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from studentinfo");
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String phone=rs.getString(3);
			String city=rs.getString(4);
			String email=rs.getString(5);
			System.out.println("Id:"+id);
			System.out.println("Name:"+name);
			System.out.println("Phone:"+phone);
			System.out.println("City:"+city);
			System.out.println("Email:"+email);
			System.out.println(".........................");
		}
	
	}
	public static boolean updateStudent(int id,String name,String cityName) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method 
		boolean f=false;
		//jdbc code
		Connection con=ConnectionProvider.createConnection();
		PreparedStatement psmt=con.prepareStatement("update studentinfo set scity=? where sid=? and sname=?");
		
		psmt.setString(1, cityName);
		psmt.setInt(2, id);
		psmt.setString(3, name);
		psmt.executeUpdate();
		 f=true;
		return f;
		
		
		
	}

}
