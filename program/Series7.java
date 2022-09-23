package program;

import java.util.Scanner;

public class Series7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double i,s=0,c;
		try(Scanner sc =new Scanner(System.in)){
			System.out.println("Enter range of N/n^2 form: ");
			n=sc.nextInt();
		}
		for(i=1;i<=n;i++)
		{
			c=i*i;
			//m=i/c;
			s=s+(i/c);
			System.out.print(String.format("%.0f", i)+"/"+String.format("%.0f", c));
			if(i<n)
			{
				System.out.print(" + ");
			}
		}
		System.out.println("="+s);
		
		
		
	}

}
