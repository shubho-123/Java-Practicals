package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEx {
	Connection connection;
	PreparedStatement pStatement;
	ResultSet rSet;
	//Constructor
	public PreparedStatementEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("Connection done");
	}
	
// * method for accessing/ fetching data from Employee table
public void getDataBySalary(float min,float max) throws SQLException {
	pStatement = connection.prepareStatement("select * from employee where salary between ? and ?");
	pStatement.setFloat(1, min);
	pStatement.setFloat(2, max);
	rSet = pStatement.executeQuery();
		while(rSet.next())
		{
			System.out.print(rSet.getInt(1)+"\t");
			System.out.print(rSet.getString(2)+"\t");
			System.out.print(rSet.getFloat(3)+"\t");
			System.out.print(rSet.getObject(4)+"\t");
			System.out.print(rSet.getString(5)+"\t");
			System.out.print(rSet.getString(6)+"\t");
			System.out.println();
		}
	}

// * method for Updating data from customer table
public void updateCustomer(int id,String phoneNo) throws SQLException {
pStatement =connection.prepareStatement("update customer set phone_no = ? where customer_id = ?");
		pStatement.setString(1, phoneNo);
		pStatement.setInt(2, id);
		int n=pStatement.executeUpdate();
		System.out.println(n+" record is updated");
	}
	
//* method for Deleting data from customer table
public void deleteCustomer(int id) throws SQLException {
pStatement =connection.prepareStatement("delete from customer where customer_id = ?");
	pStatement.setInt(1, id);
	int n=pStatement.executeUpdate();
	System.out.println(n+" record is updated");
	}

//* method for inserting data from contact table
public void insertRecord(int id,String name,String phone,float salary) throws SQLException {
		pStatement = connection.prepareStatement("insert into contact values(?,?,?,?)");
		pStatement.setInt(1, id);
		pStatement.setString(2, name);
		pStatement.setString(3, phone);
		pStatement.setFloat(4, salary);
		int n= pStatement.executeUpdate(); //
		System.out.println(n+" record is inserted:");
	}


	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//-------------------------------------------------------------
		System.out.println("Input for accessing/ fetching data from Employee table");
		System.out.println("Enter min amd max range of salary:");
		float min=sc.nextFloat();
		float max=sc.nextFloat();
		//--------------------------------------------------------------
		System.out.println("Input for inserting data from Contact table");
		System.out.println("Contact table");
		System.out.println("Enter id of contact_table ");
		int id1=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name of contact_table");
		
		String name=sc.nextLine();
		System.out.println("Enter Phone no. of contact_table");
		String phone=sc.nextLine();
		System.out.println("Enter salary of contact_table");
		float salary=sc.nextFloat();
		//--------------------------------------------------------------
		System.out.println("Input for Updating data from customer table");
		System.out.println("Enter Updated Details:");
		System.out.print("Enter id ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Phone no. of contact_table");
		String phone2=sc.nextLine();
		//--------------------------------------------------------------
		System.out.println("Input for Deleting data from customer table");
		System.out.println("Enter Delete Details on customer table:");
		System.out.print("Enter id ");
		int idc=sc.nextInt();
		//---------------------------------------------------------------
		PreparedStatementEx p1= new PreparedStatementEx();
		
		p1.getDataBySalary(min, max);
		
		p1.insertRecord(id1, name, phone, salary);
		
		p1.updateCustomer(id, phone2);
		
		p1.deleteCustomer(idc);
		sc.close();
	}

}
