package basic;

import java.util.Scanner;

public class ArrayAverEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,size,eCount=0,oCount=0,es=0,os=0;
		try (Scanner sc =new Scanner(System.in)){
		System.out.println("Enter Size of array:");
		size=sc.nextInt();
		System.out.println("Enter "+size+" Elements");
		int a[] = new int[size];
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				eCount++;
				es=es+a[i];
			}
			else
			{
				oCount++;
				os=os+a[i];
			}
			
		}
		System.out.println("averrage of Even Number: "+(es/eCount));
		System.out.println("averrage of Odd number: "+(os/oCount));
		sc.close();
	}
	}
}
