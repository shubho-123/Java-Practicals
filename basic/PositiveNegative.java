package basic;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		number = sc.nextInt();
		if(number>0)
			System.out.println("Number is Positive");
		else {
		if(number<0)
			System.out.println("Number is Negative");
		else
			System.out.println("Number is Zero");
		sc.close();
	}
	}
}
