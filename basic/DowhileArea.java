package basic;

import java.util.Scanner;

public class DowhileArea {
	public static void main(String[] args) {
		int r,h,b,l,choice;
		float c;
		char ch;
		Scanner sc =new Scanner(System.in);
		do
		{
			System.out.println("Enter your choice:\n1.Circle \n2.Triangle\n3.Rectangle");
			choice =sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter Radius of Circle: ");
			r=sc.nextInt();
			c=(float)(3.14*r*r);
			System.out.print("Area of Cicle: "+c);
			break;
			case 2: System.out.print("Enter Height of Triangle: ");
			h=sc.nextInt();
			System.out.print("Enter Base of Triangle: ");
			b=sc.nextInt();
			c=(float)(0.5*h*b);
			System.out.print("Area of Triangle: "+c);
			break;
			case 3: System.out.println("Enter Length of Rectangle: ");
			l=sc.nextInt();
			b=sc.nextInt();
			c=(l*b);
			System.out.println("Area of Rectangle: "+c);
			break;
			default: System.out.println("Incorrect Input");
			}
			System.out.println("You want continue(y/n):");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		System.out.println("Thank you");
		sc.close();
		}
	
}
