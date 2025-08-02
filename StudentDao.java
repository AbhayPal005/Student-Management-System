package com.Student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student st) {
		
		//jdbc code....
		boolean f=false;
		try {
			Connection con=CP.createC();
			
			String q="INSERT INTO students(sname,sphone,scity) VALUES(?,?,?)";
			
			//Prepare Statement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the value of Parameter
			pstmt.setString(1,st.getStudentname());
			pstmt.setString(2, st.getStudentphone());
			pstmt.setString(3, st.getStudentcity());
			
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
	}

	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		
		boolean f=false;
		try {
			Connection con=CP.createC();
			
			String q="DELETE FROM students WHERE sid=?";
			
			//Prepare Statement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the value of Parameter
			pstmt.setInt(1,userId);
			
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
		
		
	}

	public static void showAllStudents() {
		// TODO Auto-generated method stub
		try {
			Connection con=CP.createC();
			
			String q="SELECT * FROM students";
			
			//create Statement
			Statement stmt=con.createStatement();
			
			ResultSet set=stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString("scity");
				
				System.out.println("ID :"+id);
				System.out.println("Student name :"+name);
				System.out.println("Student phone :"+phone);
				System.out.println("Student city :"+city);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
				 
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static boolean updateStudentDetail(int id,String name,String phone,String city) {
		// TODO Auto-generated method stub
		
		boolean f=false;
		try {
			Connection con=CP.createC();
			
			String q="UPDATE students SET sname=?, sphone=?,scity=? where sid=?";
			
			//Prepare Statement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the value of Parameter
			pstmt.setString(1,name);
			pstmt.setString(2,phone);
			pstmt.setString(3,city);
			pstmt.setInt(4, id);
			
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
		
		
		
		
	}

}
