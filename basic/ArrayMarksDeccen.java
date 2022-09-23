package basic;

import java.util.Scanner;

public class ArrayMarksDeccen {

	public static void main(String[] args) {
		int marks[]= {65,58,89,42,76};
		int roll[]= {1,2,3,4,5};
		int i,j,t,t1;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<marks.length-1;i++)
		{
		for(j=i+1;j<marks.length;j++)
		{
				if(marks[i]<marks[j])
				{
				t=marks[i];
				marks[i]=marks[j];
				marks[j]=t;
				
				t1=roll[i];
				roll[i]=roll[j];
				roll[j]=t1;
				}	
			}
		}
		System.out.print("Roll:  ");
		for(i=0;i<roll.length;i++)
		{
			System.out.print(roll[i]+"  \t");
		}
		System.out.print("\nMarks: ");
		for(i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+"\t");
		}
		sc.close();
	}
}
