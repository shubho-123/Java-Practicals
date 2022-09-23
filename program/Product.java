package program;

import java.util.Scanner;

public class Product {
	int n;
	public int check(int a)
	{
		int r,p=1;
		this.n =a;
		while(n!=0)
		{
			r=n%10;
			p=p*r;
			n=n/10;
		}
		if(p%3==0 || p%5==0)
		return 1;
		else
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int r,p=1;
		Scanner sc =new Scanner(System.in);
		Product ob=new Product();
		int n=sc.nextInt();
		
		if(n>0) {
		
		int result=ob.check(n);
		if(result==1)
			System.out.println("yes");
		else if(result==0)
			System.out.println("no");
	}
		else
			System.out.println("Invalid Input");
		System.exit(0);
		sc.close();
	}
}
