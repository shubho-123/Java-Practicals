package basic;

import java.util.Scanner;

public class ArrayMuti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rsize,csize,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and Column size: ");
		rsize=sc.nextInt();
		csize=sc.nextInt();
		int a[][]=new int[rsize][csize];
		//int d=rsize*csize;
		/*
		 * 
		 */
		for(i=0;i<rsize;i++)
		{
			for(j=0;j<csize;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Your Array is: ");
		for(i=0;i<rsize;i++)
		{
			for(j=0;j<csize;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
