package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSimpleInterest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int principal, time, rateOfInterest;
		float simpleInterest;
		BufferedReader bo = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Principal: ");
		principal = Integer.parseInt(bo.readLine());
		System.out.print("Enter time: ");
		time = Integer.parseInt(bo.readLine());
		System.out.print("Enter Rate of Interest: ");
		rateOfInterest = Integer.parseInt(bo.readLine());
		simpleInterest =(principal*time*rateOfInterest)/100;
		System.out.println("Simple Interest is: "+simpleInterest);
	}

}
