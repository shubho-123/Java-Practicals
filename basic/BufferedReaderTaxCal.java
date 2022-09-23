package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTaxCal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int salary;
		float tax;
		BufferedReader bo = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your Salary: ");
		salary = Integer.parseInt(bo.readLine());
		tax= 0.12f*salary;
		System.out.println("Your Tax will be: "+tax);

	}

}
