package program;

import java.util.Scanner;

public class ArrayMultiAddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rsize,csize,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and Column size: ");
		rsize=sc.nextInt();
		csize=sc.nextInt();
		System.out.println();
		System.out.println("Enter Array elements of Array: 1 ");
		int array1[][]=new int[rsize][csize];
		int array2[][]=new int[rsize][csize];
		int newarray[][]=new int[rsize][csize];
		for(i=0;i<rsize;i++)
		{
			for(j=0;j<csize;j++)
			{
			array1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Your 1st Array is: ");
		for(i=0;i<rsize;i++)
		{
			for(j=0;j<csize;j++)
			{
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
	    }
		System.out.println();
		System.out.println("Enter Array elements of Array: 2 ");
		for(i=0;i<rsize;i++)
		{
			for(j=0;j<csize;j++)
			{
				array2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Your 2st Array is: ");
		for(i=0;i<rsize;i++)
		{
			for(j=0;j<csize;j++)
			{
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
	    }
		System.out.println();
		System.out.println("Addition of Array is: ");
		for(i=0;i<rsize;i++)
		{
			for(j=0;j<csize;j++)
			{
				newarray[i][j]=array1[i][j]+array2[i][j];
			}
			for(j=0;j<csize;j++)
			{
				System.out.print(newarray[i][j]+" ");
			}
			System.out.println();
	    }

}
}
