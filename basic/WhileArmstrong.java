package basic;

import java.util.Scanner;

public class WhileArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0,r,c,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		n=sc.nextInt();
		int b=n;
		while(n>0)
		{
			r=n%10;
			c=r*r*r;
			s=s+c;
			n=n/10;
		}
		if(b==s)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
		sc.close();
	}

}
