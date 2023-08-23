package com.studentmanage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App  By Md Nasir");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	while(true) {
		 System.out.println("PRESS 1 to ADD Students");
		 System.out.println("PRESS 2 to Delete Students");
		 System.out.println("PRESS 3 to Display Students");
		 System.out.println("PRESS 4 to Exit Students");
		 int c=Integer.parseInt(br.readLine());
		 if (c==1)
		 {
			 // Add Students
			 System.out.println("Enter User name");
			 String name=br.readLine();
			 
			 System.out.println("Enter user phone number");
			 String phone=br.readLine();
			 
			 System.out.println("Enter user City");
			 String City=br.readLine();
			 
			  //Create student object to store student
			 Student st = new Student(name,phone,City);
		boolean answer = StudentDao.inserStudentToDB(st);
		if(answer)
		{
			System.out.println("Successfully student is Add in Database..");
		} else {
			System.out.println("Something Went Wrong");
		}
			 System.out.println(st);
			 
		 } else if( c==2 )
		 {
			 //Delete Students
		 } else if( c==3 )
		 {
			 //Display Students
		 } else if( c==4 )
		 {
			 //Exit
			 break;
		 } else {
			 // Pro gram start again
		 }
	
	 }	
	System.out.println("Thank you for Using my App");
	System.out.println(" Bye Bye See you Again");
	
 }
}