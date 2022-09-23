package basic;

import java.util.Scanner;

public class DoWhileArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char ch;
		char choice;
		Scanner sc=new Scanner(System.in);
		do {
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
		System.out.println("Want to do it Again (Y/N): ");
		ch =sc.next().charAt(0);
		}
		while(ch=='y'|| ch=='Y');
		System.out.println("Thank You");
		sc.close();
	}

}
