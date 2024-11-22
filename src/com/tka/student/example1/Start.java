package com.tka.student.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;


public class Start {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App");
		
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Press 1 for add new Student information");
			System.out.println("Press 2 for delete existing student information");
			System.out.println("Press 3 for access student information");
			System.out.println("Press 4 for update existing student information");
			System.out.println("Press 5 for exit from app");
			
			
			int num=Integer.parseInt(br.readLine());
			
			if(num==1)
			{
				//add new student
				System.out.println("Enter student name");
				String name=br.readLine();
				System.out.println("Enter student phone");
				String phone=br.readLine();
				System.out.println("Enter student city");
				String city=br.readLine();
				System.out.println("Enter student email");
				String email=br.readLine();
				//create student object to store student
				 StudentInfo obj1=new StudentInfo(name, phone, city, email);
	
				 boolean f=StudentDao.insertStudent(obj1);
				 
				 if(f)
				 {
					 System.out.println("Student is added successfully...");
				 }
				 else
				 {
					 System.out.println("Somthing went wrong..");
				 }
			 System.out.println(obj1);
			}
			else if(num==2)
			{
				//delete student
				System.out.println("Enter student id to delete student info");
				int id=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(id);
				if(f)
				{
					System.out.println("Deleted....");
				}
				else
				{
					System.out.println("Somthing went wrong...");
				}
			}
			else if(num==3)
			{
				//retrive info
				StudentDao.showStudent();
				
			}
			else if(num==4)
			{
				//update student
				System.out.println("Enter id ");
				int id=Integer.parseInt(br.readLine());
				System.out.println("Enter name");
				String name=br.readLine();
				System.out.println("Enter city name");
				String cName=br.readLine();
				
				boolean f=StudentDao.updateStudent(id,name,cName);
				if(f)
				{
					System.out.println("Student is successfully updated..");
				}
				else
				{
					System.out.println("Something went wrong");
				}
			
				
			}
			else if(num==5)
			{
				//exit
				break;
			}
			else
			{
				
			}
				
			
		}
		System.out.println("Than you for using my application");
		System.out.println("see you...bye bye");
		
	}
	

}
