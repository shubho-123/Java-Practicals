package basic;

import java.util.Scanner;

public class TaxCalculatorIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary;
		float tax;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary");
		salary = sc.nextInt();
		if(salary>25000)
		{
			tax= 0.15f*salary;
			System.out.println("Tax: "+tax);
			
		}
		else
		{
			tax= 0.1f*salary;
			System.out.println("Tax: "+tax);
		}
		sc.close();
		
	}

}
