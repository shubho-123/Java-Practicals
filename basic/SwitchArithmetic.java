package basic;

import java.util.Scanner;

public class SwitchArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char choice;
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		a = sc.nextInt();
		b= sc.nextInt();
		System.out.println("Enter you choice: \n + Add:\n- Sub:\n* Multi:\n/ Sub:");
		choice = sc.next().charAt(0);
		switch (choice)
		{
		case '+': System.out.println("Addition: "+(a+b));
		break;
		case '-': System.out.println("Subtraction: "+(a-b));
		break;
		case '*': System.out.println("Multipletion: "+(a*b));
		break;
		case '/': System.out.println("Divition: "+(a/b));
		break;
		default: System.out.println("Invalid");
		}
		sc.close();
	}

}
