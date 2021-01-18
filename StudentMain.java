package main;
import student.StudentBean;
import insert.StudentInsertion;

import java.sql.SQLException;

import connections.DBUtil; 
public class StudentMain {
public static void main(String[] args) throws ClassNotFoundException, SQLException
{
	StudentBean sb=new StudentBean();
	sb.setRegno(1900);
	sb.setName("Sharez");
	StudentInsertion si=new StudentInsertion();
	int i=si.StudentInsert(sb);
	if(i>0)
	{
		System.out.println(" Insertion Success");
	}
	else {
		System.out.println("fail");
	}
	
}
	
}
