package classandobject;

import java.util.Scanner;
//import java.lang.math;

public class CompoundInterest {
	double a,p,n,r,q,l;
	
	public double amount(float b,float n)
	{
		//a=b;
	//	n=d;
		
		if(n<1)
			r=9;
		else if(n>=1 && n<=3)
			r=9.25f;
		else if(n>3 && n<=5)
			r=9.5f;
		else 
			r=9.5f;
		q=1+(r/100);
		
		a=(double)Math.pow(q,n);
		l=b*a;
		
		return l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompoundInterest ob=new CompoundInterest();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=sc.nextLine();
		System.out.println("Enter Principal Amount: ");
		float b=sc.nextFloat();
		System.out.println("Enter o. of Years: ");
		float c=sc.nextFloat();
		double g=ob.amount(b,c);
		System.out.println("The Accumulated amount: "+g);
		
	}

}
