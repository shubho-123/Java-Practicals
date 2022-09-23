package basic;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,size,max=0,min=0;
		
		try (Scanner sc =new Scanner(System.in)){
		System.out.print("Enter size of array: ");
		size=sc.nextInt();
		System.out.println("Enter "+size+" elements");
		int a[]=new int[size];
	//	int min=a[0];
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		min=max;
		for(i=0;i<a.length;i++)
		{
				if(a[i]<min)
				{
					min=a[i];
				}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		sc.close();
	}
	}
}
