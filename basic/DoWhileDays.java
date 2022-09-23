package basic;

import java.util.Scanner;

public class DoWhileDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.print("Enter a number: ");
		choice=sc.nextInt();
		switch (choice)
		{
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thrusday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default: System.out.println("Invalid");
		}
		System.out.print("DO you want to continue:(Y/N):");
		ch=sc.next().charAt(0);
		}
		while(ch=='y'|| ch=='Y');
		System.out.println("Thank You");
		sc.close();
	}

}
