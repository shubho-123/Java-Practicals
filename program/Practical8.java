package program;

import java.util.Scanner;

public class Practical8 {
	int count=0,r;
	public int countDigits(int n)
	{
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		Practical8 obj=new Practical8();
		//System.out.println(".........");
		n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		else
		{
		int c=obj.countDigits(n);
		System.out.println(c);
		}
		sc.close();
	}

}
