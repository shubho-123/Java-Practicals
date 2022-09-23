package basic;

import java.util.Scanner;

public class DoWhileNumberCheack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		char ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			
		System.out.println("Enter a number");
		n =sc.nextInt();
			if(n>0)
			{
				if(n%2==0)
				{
					System.out.println("Even");
			    }
				else {
					System.out.println("Odd");
				}
		 }
			System.out.println("If you Want to continue(y/n)");
			ch =sc.next().charAt(0);
	}
		while(ch=='y' || ch=='Y');
		System.out.println("Thank You");
		sc.close();
	}

}
