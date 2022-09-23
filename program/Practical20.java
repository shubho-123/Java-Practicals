package program;

import java.util.Scanner;

public class Practical20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		Practical20 practical20=new Practical20();
		
		System.out.println(" ");
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		else
		{
			if(n%2==0)
			{
				System.out.println("Size must be odd");
				System.exit(0);
			}
			else
			{
		int a[]=new int[n];
		for( i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
		if(a[0]==a[a.length/2])
		{
			System.out.println("100");
		}
		else
			System.out.println(a[0]);
			}
		}
	}

}
