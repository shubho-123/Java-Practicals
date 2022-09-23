package classandobject;

import java.util.Scanner;

public class DefaultWithReturn {
	
	int a,b;
	
	public void method2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("I am in method2");
		int y=method4();
		System.out.println("Multi: "+y);
	}
	public int methode1()
	{
		int c=a+b;
		return c;
	}
	public int methode3()
	{
		return a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultWithReturn ob=new DefaultWithReturn();
		ob.method2();
		int h=ob.methode1();
		int j=ob.methode3();
		System.out.println("Add: "+h);
		System.out.println("Sub: "+j);
		
	}
	public int method4()
	{
		return a*b;
	}

}
