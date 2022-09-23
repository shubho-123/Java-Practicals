package basic;

import java.util.Scanner;

public class WhileReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0,n,r;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number: ");
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		System.out.println("Reverse of the Number: "+s);
		sc.close();
	}

}
