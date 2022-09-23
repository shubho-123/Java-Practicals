package program;

import java.util.Scanner;

public class Practical22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0, flag=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid array size");
			System.exit(0);
		}
		else
		{
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
			else
			{
				a[i]=sc.nextInt();
			}
		}
		for(int j=0;j<a.length-1;j++)
		{
			 flag=0;
			if(a[j]>a[j+1])
			{
				d=a[j]-a[j+1];
			}
			else
			{
				d=a[j+1]-a[j];
			}
			if(d<4)
			{
				flag=1;
				break;
			}

		}
		if(flag==1)
			System.out.println("0");
		else
			System.out.println("1");
		
		
		}
		
	}

}
