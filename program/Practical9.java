package program;

import java.util.Scanner;

public class Practical9 {
	float avg;
	int i,s=0;
	
	public float avgArray(int a[],int size)
	{
		for(int j=0;j<size;j++)
		{
				s=s+a[j];
		}
		avg=(float)s/size;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Practical9 obj=new Practical9();
		Scanner sc=new Scanner(System.in);
		//System.out.println("...........");
		size=sc.nextInt();
		if(size<0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		else
		{	
			int a[]=new int[size];
			for(int i=0;i<a.length;i++)
			{
			a[i]=sc.nextInt();
			if(a[i]<0)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
			}
			float c=obj.avgArray(a, size);
			System.out.println(String.format("%.2f", c));
		}
		sc.close();

	}

}
