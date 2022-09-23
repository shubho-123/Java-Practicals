package classandobject;

import java.util.Scanner;

public class PrimeNoCheck {
	
	
	public void prime(int n)
	{
		if(n%2!=0)
		System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNoCheck ob=new PrimeNoCheck();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		ob.prime(n);
	}

}
