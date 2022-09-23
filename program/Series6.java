package program;

import java.util.Scanner;

public class Series6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,s=0;
		try(Scanner sc =new Scanner(System.in)){
		System.out.println("Enter a number in N/N form: ");
		n=sc.nextInt();
		}
		for(i=1;i<=n;i++)
		{
			s=s+1;
			System.out.print(i+"/"+i);
			if(i<n)
				System.out.print(" + ");
		}
		System.out.println("="+s);
	}

}
