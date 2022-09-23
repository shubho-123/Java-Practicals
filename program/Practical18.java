package program;

import java.util.Scanner;

import org.junit.validator.PublicClassValidator;

public class Practical18 {
	int above_average;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Practical18 practical18=new Practical18();
		System.out.println(" ");
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		else
		{
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
		;
		practical18.aboveAverageMarks(a, n);
		}
	}
	public void aboveAverageMarks(int array[], int size) {
		float average,s=0;
		int i,j;
		for(j=0;j<size;j++)
		{
			s+=array[j];
		}
		average=s/size;
		for(i=0;i<size;i++)
		{
			
			if(array[i]>=average)
			{
				
				this.above_average=array[i];
				
				System.out.println(above_average);
			}
		}
	}
}
