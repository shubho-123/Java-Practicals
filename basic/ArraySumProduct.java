package basic;

import java.util.Scanner;

public class ArraySumProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,s=0,p=1;
		try (Scanner sc= new Scanner(System.in)) {
		System.out.print("Enter the size of ther Array: ");
		size=sc.nextInt();
		System.out.println("enter "+size+" Elements ");
		int a[]=new int[size];
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0) {
			s=s+a[i];
				}
			else {
			p=p*a[i];
				}
		}
		System.out.println("Sum of Even: "+s);
		System.out.println("Product of Odd: "+p);
		sc.close();
	}
}
}
