package basic;

import java.util.Scanner;

public class ArrayShortingDeccending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,size,t;
		try (Scanner sc=new Scanner(System.in)){
		System.out.print("Enter Size of Array:");
		size=sc.nextInt();
		System.out.println("Enter "+size+" array elements: ");
		int a[]=new int[size];
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	
		for(i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]<a[j])
				{
				t=a[i];
			
				a[i]=a[j];
				a[j]=t;
				}
			
				
			}
			
		
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Max number "+a[0]);
		System.out.println("Min number "+a[a.length-1]);
		sc.close();
	}
}
}