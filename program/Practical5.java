package program;

import java.util.Scanner;

public class Practical5 {
	int n,r,j=0,m=0,k=0;
	
	public int generateCode(int coupon)
	{
		n=coupon;
	    	
		while (n != 0)
		  {
		    r = n % 10;
		    n = n / 10;
		    if(r%2==0)	 
		    {
		    	m=m*10+r;
		    }
		
		  }
		return m;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coupon ,s=0,r,c;
		Practical5 p=new Practical5();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Copon code: ");
		coupon=sc.nextInt();
		if(coupon<0)
			System.out.println("Number is too Small");
		else if(coupon>32767)
			System.out.println("Number is Too Large");
		else {
		c=	p.generateCode(coupon);
		
		while(c!=0)
		{
		r=c%10;
		s=s*10+r;
		c=c/10;
		}
	System.out.println(s);
		}
	
	}

}
