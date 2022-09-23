package basic;

import java.util.Scanner;

public class ArrayAccenDeccen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,size=10,t;
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter "+size+" array elements: ");
			int a[]=new int[size];
			for(i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<4;i++)
			{
				for(int j=i+1;j<5;j++)
				{
					
					if(a[i]>a[j])
					{
					t=a[i];
				
					a[i]=a[j];
					a[j]=t;
					}
				
					
				}
			
			}
			for(i=5;i<9;i++)
			{
				for(int j=i+1;j<10;j++)
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
		}
	}

}
