package java8features;

import java.util.Scanner;

@FunctionalInterface
interface Percentage
{
	double percentage(double m1,double m2, double m3);
}


public class LambdaPercentage {
	public static void main(String[] args) {
		
		double m1,m2,m3;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter marks of 3 subjects: ");
		m1=sc.nextDouble();
		m2=sc.nextDouble();
		m3=sc.nextDouble();
		
		Percentage referanceVariable = (a,b,c) ->
		{
			double s=0;
			s=a+b+c;
			return s/3;
		};
		System.out.println("Percentage: "+String.format("%.2f", referanceVariable.percentage(m1, m2, m3) ));
	}

}
