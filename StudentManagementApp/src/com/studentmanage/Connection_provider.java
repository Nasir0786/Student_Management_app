package com.studentmanage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_provider {
	
	static Connection con;
	
	public static Connection create_connection() {
		
		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// create Connection..
			String user = "root";
			String password = "Nasir@746";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			
			con = DriverManager.getConnection(url,user,password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
