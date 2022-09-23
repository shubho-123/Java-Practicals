package program;

import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s=1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a Square series limit: ");
			n=sc.nextInt();
		}
		for(int i=1;i<=n;i++)
		{
			s=i*i*i;
			if(s<=n) 
			{
			System.out.print(s+" ");
			}
		}
	}

}
