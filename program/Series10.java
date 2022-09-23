package program;

import java.util.Scanner;

public class Series10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,s=0;
	//	int nCount=0,pCount=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a range: ");
		n=sc.nextInt();
		for(i=1;i<=n;i=i+2)
		{
			//s=s+(pCount-nCount);
			s=s+(i-(i+1));
			//System.out.print(i);
			System.out.print(i+" - "+(i+1)+" ");
			if(i<n)
			{
				System.out.print(" + ");
			}
			
		/*	if(i%2!=0)
			{
				//nCount++;
				if(i<n)
				System.out.print(" - ");
			}
			else
			{
				//pCount++;
				if(i<n)
				System.out.print(" + ");
			} */
		}
		System.out.println(" ="+s);
	}

}
