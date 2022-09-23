package classandobject;

import java.util.Scanner;

public class ThisConstructorRacrangle {

	int l,b;
	public ThisConstructorRacrangle(int l,int b)
	{
		this.l=l;
		this.b=b;
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
		ThisConstructorRacrangle ob1=new ThisConstructorRacrangle(c,d);
		ob1.area();
	
		
		
	}

}
