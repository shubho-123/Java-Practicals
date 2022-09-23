package basic;

import java.util.Scanner;

public class CircleArea {
	public static void main(String args[]) {
	double r,c;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius ");
	r = sc.nextDouble();
	
	c =(3.14*r*r);
	System.out.println("Area of the circle is=  "+c);
	sc.close();
}
}
