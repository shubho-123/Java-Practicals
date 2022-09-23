package classandobject;

import java.util.Scanner;

public class ConstructorRacrangle {

	int l,b;
	public ConstructorRacrangle(int a,int m)
	{
		l=a;
		b=m;
	}
	public void area()
	{
		System.out.println("Area:  "+(l*b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter length and breadth of Ractangle: ");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int d=sc.nextInt();
		ConstructorRacrangle ob1=new ConstructorRacrangle(c,d);
		ob1.area();
	
		
		
	}

}
