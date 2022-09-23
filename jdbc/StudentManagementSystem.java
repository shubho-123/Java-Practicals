package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class StudentManagementSystem {
	 Connection connection;
	Statement statement;
	PreparedStatement pStatement;
	CallableStatement cStatement;
	ResultSet rSet;
	
//--------------------------------------------
	public StudentManagementSystem() throws ClassNotFoundException, SQLException
	{
		connection=MyConnection.getMyConnection();
		System.out.println("Connection Done:");
	}
//-------------------------------------------------
	public void insertStudentsRecords(int rollNO, String name , float percentage , LocalDate DOB, String email, String phNo,String city) throws SQLException {
		cStatement=connection.prepareCall("{call insert_student_record(?,?,?,?,?,?,?)}");
		cStatement.setInt(1, rollNO);
		cStatement.setString(2, name);
		cStatement.setFloat(3, percentage);
		cStatement.setObject(4, DOB);
		  cStatement.setString(5, email);
		  cStatement.setString(6, phNo);
		  cStatement.setString(7, city);
		  cStatement.execute();
		  System.out.println("Records are inserted");
	}
//------------------------------------------------------
	public void viewAllStudentDetails() throws SQLException {
		pStatement =connection.prepareStatement("select * from Student_Details");
		rSet=pStatement.executeQuery();
		records(rSet);
	}
	
//----------------------------------------------------
	public void records(ResultSet rSet) throws SQLException {
		while(rSet.next())
		{
			System.out.println(rSet.getInt(1)+"\t");
			 System.out.print(rSet.getString(2)+ "\t");
			 System.out.print(rSet.getFloat(3)+ "\t");
			 System.out.print(rSet.getDate(4)+ "\t");
			 System.out.print(rSet.getString(5)+ "\t");
			 System.out.print(rSet.getString(6)+ "\t");
			 System.out.print(rSet.getString(7)+ "\t");
			 System.out.println();
		}
	}
	
//------------------------------------------------------
	public void viewAllStudentByID(int id) throws SQLException {
		pStatement =connection.prepareStatement("select * from Student_Details where rollNo=?;");
		pStatement.setInt(1, id);
		rSet=pStatement.executeQuery();
		records(rSet);
	}
//------------------------------------------------------
	public void searchByCity(String c) throws SQLException {
		pStatement =connection.prepareStatement("select * from Student_Details where city=?");
		pStatement.setString(1, c);
		rSet=pStatement.executeQuery();
		records(rSet);
	}

//--------------------------------------------------
	public void searchByPercentage(float min,float max) throws SQLException {
		pStatement =connection.prepareStatement("select * from Student_Details where percentage between ? and ?");
		pStatement.setFloat(1, min);
		pStatement.setFloat(2, max);
		rSet=pStatement.executeQuery();
		records(rSet);
	}

//--------------------------------------------------
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int rollNo;
		String city;
		 StudentManagementSystem  obj = new StudentManagementSystem();
         
         Scanner scanner = new Scanner(System.in);
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your Choice");
         System.out.println("1.insert student details(create a procedure)\r\n"
         		+ "2.view all student details\r\n"
         		+ "3.view student details on the basis of rolllno\r\n"
         		+ "4.search student by city name\r\n"
         		+ "5.view all student details in the range of min and max \r\n"
         		+ "");
  int choice = scanner.nextInt();
         
         switch (choice) {
		case 1:
			 System.out.println("Enter Roll no. ");
			  rollNo = scanner.nextInt();
			 scanner.nextLine();
			 
			 System.out.println("Enter Name :");
			 String name = scanner.nextLine();
			 
			 System.out.println("Enter Percentage :");
			 float percentage = scanner.nextFloat();
			 
			 System.out.println("Enter DOB (YYYY-MM-DD) : ");
			 String dob = sc.nextLine();
			 
			 System.out.println("Enter email");
			 String email = sc.nextLine();
			 
			 System.out.println("Enter Phone No. :");
			 String phNo = sc.nextLine();
			 
			 System.out.println("Enter City :");
			  city = sc.nextLine();
			 obj.insertStudentsRecords(rollNo, name, percentage, LocalDate.parse(dob), email, phNo, city);
			 break;
		case 2:
			obj.viewAllStudentDetails();
			break;
		case 3:
			System.out.println("Enter Roll no to fetch the Students Details: ");
			rollNo=sc.nextInt();
			obj.viewAllStudentByID(rollNo);
			break;
		case 4:
			System.out.println("Enter city Name to fetch the Students Details:");
			city=sc.nextLine();
			obj.searchByCity(city);
			break;
		case 5:
			
			
         }

	}

}
