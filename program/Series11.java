package program;

import java.util.Scanner;

public class Series11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double i,s=0,fac=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter range of n/n! form: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{	
			fac=fac*i;
			s=s+(i/fac);
			System.out.print(String.format("%.0f", i)+"/"+String.format("%.0f", i)+"!");
			if(i<n)
			{
				System.out.print(" + ");
			}
			
		}
		
		System.out.println(" ="+s);
		//or
	//	System.out.println(" ="+String.format("%.2f", s));
	}

}
