package java8features;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

@FunctionalInterface
interface SimpleInt
{
	float simpleInterest(float p,float n, float r);
}



public class LambdaSimpleInterest {
	public static void main(String[] args) {
		
		float p,t,r,si;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amount: ");
		p=sc.nextFloat();
		System.out.print("Enter year: ");
		t=sc.nextFloat();
		System.out.print("Enter ROI: ");
		r=sc.nextFloat();
		
		SimpleInt referanceVariable = (x,y,z) ->
		{
			
		 return x*y*z/100;
		};
		
	System.out.println("Simple Interest: "+referanceVariable.simpleInterest(p, t, r));
	}
	
}
