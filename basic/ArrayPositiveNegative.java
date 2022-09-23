/*package basic;

import java.util.Scanner;

public class ArrayPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,pCount=0,nCount=0,oCount=0;
		try (Scanner sc= new Scanner(System.in)){
		System.out.println("Enter Size of Array: ");
		size =sc.nextInt();
		System.out.println("Enter"+size+"Array Elements: ");
		int a[] =new int[size];
		
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{   
			
			if(a[i]>0)
			{
				pCount++;	
			}
			else
			{
				if(a[i]<0) {
					nCount++;
				}
				else
				oCount++;
			}
		}
		System.out.println("+ve: "+pCount);
		System.out.println("-ve: "+nCount);
		System.out.println("Zero "+oCount);
		sc.close();
	}
}
}*/



package basic;

import java.util.Scanner;

public class ArrayPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,pCount=0,nCount=0,oCount=0;
		try (Scanner sc= new Scanner(System.in)){
		System.out.println("Enter Size of Array: ");
		size =sc.nextInt();
		System.out.println("Enter"+size+"Array Elements: ");
		int a[] =new int[size];
		
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{   
			
			if(a[i]>0)
			{
				pCount++;	
			}
			else
			{
				if(a[i]<0) {
					nCount++;
				}
				else
				oCount++;
			}
		}
		System.out.println("+ve: "+pCount);
		System.out.println("-ve: "+nCount);
		System.out.println("Zero "+oCount);
		sc.close();
	}
}
}