package classandobject;

import java.util.Scanner;

public class DefaultWithoutReturn {
	int a,b;
	public void method1()
	{
		int c;
		c=a+b;
		System.out.println("Addition: "+c);
	}

	public void method2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number: ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultWithoutReturn obj= new DefaultWithoutReturn();
		obj.method2();
		obj.method1();

	}

}
