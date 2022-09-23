package program;

import java.util.Scanner;

public class Practical7 {
	int sum=0,size,age[],i;
	public int newArraySum(int age[],int size)
	{
		for(int j=0;j<size;j++)
		{
			if(age[j]>=18)
				sum=sum+age[j];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		
		Scanner sc=new Scanner(System.in);
		Practical7 ob=new Practical7();
		System.out.println("Enter the no. of Employees: ");
		n=sc.nextInt();
		if(n<0) 
		{
			System.out.println("Invalid array size");
			System.exit(0);
		}
		int a[]=new int[n];
		if(n>0)
		{
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
				
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
		}
		
		int s=ob.newArraySum(a, n);
		System.out.println(s);
			

	}

}
