package program;

import java.util.Scanner;

public class Practical21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
		System.out.println("Number too small");
		System.exit(0);
		}
		else if(n>32767)
		{
			System.out.println("Number too large");
			System.exit(0);
		}
		else
		{
			int d;
			d=sc.nextInt();
			while(n!=0)
			{
				int r=n%10;
				n=n/10;
				if(d==r)
				{
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
