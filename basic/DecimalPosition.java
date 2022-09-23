package basic;

import java.util.Scanner;

public class DecimalPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a double value: ");
		n=sc.nextDouble();
		//System.out.printf("%.0f",n);
		System.out.println(String.format("%.0f", n));
	}

}
