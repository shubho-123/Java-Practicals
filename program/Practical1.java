package program;

import java.util.Scanner;

public class Practical1 {
	int a[],n,i,max=0,j,tem=0;
	public int calculate(int a[],int n)
	{
		for(i=0;i<a.length-1;i++)
		{
				
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					tem=a[i];
					a[i]=a[j];
					a[j]=tem;
				}
			}
		}
		int length=a.length;
		return a[length-2];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Enter size of Array: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid array size");
		System.exit(0);
		}
			System.out.println("Enter "+n+" Integer Elements");
		int a[]=new int[n];
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
			{
				System.out.println("Invalide");
			System.exit(0);			//use to terminate the programmer;
		}
		}
		Practical1 p=new Practical1();
		int b=p.calculate( a, n);
		System.out.println("Second largest array element: "+b);
		
	}

}
