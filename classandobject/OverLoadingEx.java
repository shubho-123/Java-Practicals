package classandobject;

import java.util.Scanner;

public class OverLoadingEx {
	public void add(int a,int c,int e)
	{
		System.out.println("Add of 3 Integer: "+(a+c+e));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingEx o=new OverLoadingEx();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Integer: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		o.add(a, a, b);
		System.out.println("Enter 2 decimal number: ");
		double f=sc.nextDouble();
		double g=sc.nextDouble();
		o.add(f, g);
	}
	public void add(double a, double g)
	{
		System.out.println("Add of 2 Decimal value: "+(a+g));
	}

}
