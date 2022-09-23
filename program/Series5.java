package program;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		double s=0;
		try (Scanner sc=new Scanner(System.in)){
		System.out.println("Enter Your 1/n range: ");
		System.out.println("Put n only: ");
		n=sc.nextDouble();
		}
		for(double i=1;i<=n;i++)
		{
			s=(s+(1/i));
			System.out.print("1/"+String.format("%.0f", i));
			if(i<n)
				System.out.print(" + ");
		}
		System.out.print("="+s);
	}

}
