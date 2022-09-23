package classandobject;

import java.util.Scanner;

public class OveelodingArea {
	
public void area(float c)
	{
		System.out.println("Area of Circle: "+(3.14*c*c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OveelodingArea o=new OveelodingArea();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		float b=sc.nextFloat();
		o.area(b);
		System.out.println("Enter 2 Inter no.: ");
		int a=sc.nextInt();
		int n=sc.nextInt();
		double r=o.area(a, n);
		System.out.println("Area of Triangle: "+r);
		
	}
	public double area(int c,int b)
	{
		return (0.5*c*b);
	}

}
