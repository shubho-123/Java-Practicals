package program;

import java.util.Scanner;

public class EmployeePractical {
	Scanner sc=new Scanner(System.in);
	String empName;
	long empCode;
	int basicSalary;
	double tax,grossSalary,netSalary,allowance;
	public EmployeePractical()
	{
		empName="";
		empCode=0;
		basicSalary=0;
		allowance=0;
		tax=0;
		grossSalary=0;
		netSalary=0;
	}
	public void accept()
	{
		System.out.print("\nEnter Employee Name: ");
		empName=sc.nextLine();
		System.out.print("\nEmployee Code: ");
		empCode=sc.nextLong();
		System.out.print("\nEmployee's Basic Salary: ");
		basicSalary=sc.nextInt();

	}


	public static void main(String[] args) {
		EmployeePractical ob1=new EmployeePractical();
		ob1.accept();
		ob1.allow();
		ob1.gross();
		ob1.tax();
		ob1.net();
		ob1.display();
	}
	public void allow()
	{
		allowance=0.55f*basicSalary;
	}
	public void gross()
	{
		grossSalary=allowance+basicSalary;
	}
	public void tax()
	{
		tax=0.12f*grossSalary;
	}
	public void net()
	{
		netSalary=grossSalary-tax;
	}
	
	public void display()
	{
		System.out.println("\n\nEmployee Code:........  "+empCode);
		System.out.println("Employee Name:........  "+empName);
		System.out.println("Employee Basic Salary:  "+basicSalary);
		System.out.println("Employee Gross Salary:  "+String.format("%.02f",grossSalary));
		System.out.println("Employee Tax:.........  "+String.format("%.02f", tax));
		System.out.println("Employee Nte Salary:..  "+String.format("%.02f", netSalary));
	}

}
