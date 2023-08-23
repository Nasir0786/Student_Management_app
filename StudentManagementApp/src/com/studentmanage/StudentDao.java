package com.studentmanage;

import java.sql.Connection;

import java.sql.PreparedStatement;

public class StudentDao {

	public static boolean inserStudentToDB(Student st)
	{
		boolean f=false;
		try {
			
			// jdbc code...
			Connection con = Connection_provider.create_connection();
			String q="insert into students(S_name,S_ph,city) values(?,?,?) ";
			// prepareStatement
			 PreparedStatement pstmt = con.prepareStatement(q);
			 //set the value of the parameter
			 pstmt.setString(1, st.getStudentName());
			 pstmt.setString(2, st.getStudentPhone());
			 pstmt.setString(3, st.getStudentName());
			 
			 //execute
			 pstmt.executeUpdate();
			 f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
		return f;
	}
}
