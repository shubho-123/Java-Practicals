package program;

import java.util.Scanner;

public class Practical19 {
	static int cleared;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Practical19 practical19=new Practical19();
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		else if(n>=3)
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
		practical19.clearedStage1(a, n);
		}
		else
			System.out.println("Enter array size greatter or equal to 3");
	}
	public void clearedStage1(int array[], int size) {
		for(int j=0;j<size-1;j=j+3)
		{
			cleared=array[j];
			if(array[j+1]>=70 && array[j+2]>=70)
			{
				System.out.println(cleared);
			}
		}
	}
}
