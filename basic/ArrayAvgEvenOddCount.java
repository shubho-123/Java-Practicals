package basic;

import java.util.Scanner;

public class ArrayAvgEvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,eSum=0,eCount=0,oCount=0,oSum=0;
		try (Scanner sc =new Scanner(System.in)){
		System.out.print("Enter size of array: ");
		size=sc.nextInt();
		System.out.println("Enter"+size+"Array elements: ");
		int a[]=new int[size];
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				eCount++;
				eSum=eSum+a[i];
			}
			else
			{
				oCount++;
				oSum=oSum+a[i];
			}
			
		}
		System.out.println("Even Number Average: "+(eSum/eCount));
		System.out.println("Odd Number Average: "+(oSum/oCount));
		sc.close();
	}
	}

}
