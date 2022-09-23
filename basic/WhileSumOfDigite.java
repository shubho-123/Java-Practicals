package basic;

import java.util.Scanner;

public class WhileSumOfDigite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0,n,r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			s=s+r;
			n=n/10;
		}
		System.out.println("Sum of Digite: "+s);
		sc.close();
	}

}
