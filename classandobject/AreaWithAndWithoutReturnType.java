package classandobject;

import java.util.Scanner;

public class AreaWithAndWithoutReturnType {
	Scanner sc=new Scanner(System.in);
	int ba,a;
	public void square()
	{
		
		System.out.println("Enter one Side of Squre: ");
		int s=sc.nextInt();
		 a=s*s;
		System.out.println("Area of squre: "+a);
		
	} 
	public void circle()
	{	
		//Scanner b=new Scanner(System.in);
		System.out.println("Enter Radius: ");
		 ba=sc.nextInt();
		float c=(3.14f*ba*ba);
		System.out.println("Area of Circle: "+c);
	}
	public int ractangle()
	{
		//Scanner n=new Scanner(System.in);
		System.out.println("Enter lenth and Breadth of ractangle: ");
		int g=sc.nextInt();
		int h=sc.nextInt();
		a=g*h;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaWithAndWithoutReturnType ob=new AreaWithAndWithoutReturnType();
		ob.square();
		ob.circle();
		int k=ob.ractangle();
		System.out.println("Area of Ractangle: "+k);
		double e=ob.triangle();
		System.out.println("Area of Triangle : "+e);
	}
	public float triangle()
	{
	//Scanner p=new Scanner(System.in);
		System.out.println("Enter height and base of triangle: ");
		int g=sc.nextInt();
		int h=sc.nextInt();
		float l=(0.5f*g*h);
		return l;
	}


}
