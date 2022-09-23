package basic;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		a= sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		b= sc.nextInt();
		System.out.print("Enter 3rd Number: ");
		c= sc.nextInt();
		if(a>b) {
			if(a>c)
				System.out.println("Greatest NUmber: "+a);
			else
				System.out.println("Greatest Number: "+c);
		}
		else
			if(b>c)
				System.out.println("Greatest Number: "+b);
			else
				System.out.println("Greatest Number: "+c);
		sc.close();
	}

}
