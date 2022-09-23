package basic;

import java.util.Scanner;

public class SwitchArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,l,b,h;
		float r,a;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Circle\n2. Rectangle\n3. Triangle\nEnter your Choice:");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1: System.out.println("Enter Radius of cirrcle: ");
		r =sc.nextFloat();
		a=(float)(3.14*r*r);
		System.out.println("Area of Corcle is: "+a);
		break;
		case 2: System.out.println("Enter length:");
		l = sc.nextInt();
		System.out.println("Enter Breath: ");
		b = sc.nextInt();
		a=(float)(l*b);
		System.out.println("Area of Rectangle is: "+a);
		break;
		case 3: System.out.println("Enter height:");
		h = sc.nextInt();
		System.out.println("Enter base: ");
		b= sc.nextInt();
		a=(float)(0.5*h*b);
		System.out.println("Area of Trinagle: "+a);
		break;
		default: System.out.println("Wrong Input");
		}
		sc.close();
	}

}
