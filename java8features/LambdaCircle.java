package java8features;

import java.util.Scanner;
@FunctionalInterface
interface Circle
{
	float circle(float r);
}



public class LambdaCircle {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter radious of a Circle: ");
	float r=sc.nextFloat();
	
	Circle referanceVariable = area ->
	{
		return 3.14f*r*r;
	};
	System.out.println("Area of Circle: "+referanceVariable.circle(r));
	}

}
