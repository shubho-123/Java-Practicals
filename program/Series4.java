package program;

import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		int n,c=1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter The Range of odd cube Series: ");
			n=sc.nextInt();
		}
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				c=i*i;
				if(c<=n)
				{
				System.out.print(c+" ");
				}
			}
		}
		
	}

}
