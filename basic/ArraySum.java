package basic;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0,size;
		try (Scanner sc=new Scanner(System.in)){
		System.out.print("Enter Size of Array: ");
		size = sc.nextInt();
		System.out.println("Enter "+size+" Array Elements:");
		int a[]= new int[size];
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of Array "+sum);
		sc.close();
	}
	}
}
