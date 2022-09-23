package basic;

import java.util.Scanner;

public class ArrayDeclaration {

	public static void main(String[] args) {
		
		int i,size;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		size = sc.nextInt();
		System.out.println("Enter"+size+"Array Elements:");
		
		int a[]= new int[size];
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are");
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
		sc.close();
	}
}


