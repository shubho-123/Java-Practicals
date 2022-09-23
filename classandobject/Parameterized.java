package classandobject;

import java.util.Scanner;

public class Parameterized {
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Add: "+c);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized p=new Parameterized();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		p.add(a, b);
		int r=p.sub(a,b);
		System.out.println("Sub: "+r);
	}
	public int sub(int a,int b)
	{
		return a-b;
	}

}
