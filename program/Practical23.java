package program;

import java.util.Arrays;
import java.util.Scanner;

public class Practical23 {
	public int maxRepeatedElement(int a[],int n) {
		int result = 0;
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int count=0, tempCount=0;
				if(a[i]==a[j])
				{
					count++;
					if(tempCount<count)
					{
						tempCount=count;
						result=a[i];
					}
				}
				else 
					break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Practical23 practical23=new Practical23();
		int size=sc.nextInt();
		if(size<0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		else
		{
			int array[]=new int[size];
			for(int i=0;i<array.length;i++)
			{
				array[i]=sc.nextInt();
				if(array[i]<0)
				{
					System.out.println("Invalid Input");
					System.exit(0);
				}
			}
		
			int result=practical23.maxRepeatedElement(array, size);
			System.out.println(result);
		}
	}
}
