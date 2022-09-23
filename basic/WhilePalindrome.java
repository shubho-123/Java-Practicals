package basic;

import java.util.Scanner;

public class WhilePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0,n,r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		n=sc.nextInt();
		int b=n;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
			
		}
		if(b==s)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		sc.close();
	}

}
