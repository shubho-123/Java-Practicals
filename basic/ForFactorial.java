package basic;

import java.util.Scanner;

public class ForFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,f=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Number: ");
		n =sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial: "+f);
		sc.close();
	}

}
