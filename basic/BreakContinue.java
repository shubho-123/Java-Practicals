package basic;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				break;
			System.out.println(i);
		}
		System.out.println("Continue press Y for Break;\n press N for Continue: ");
		ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');

		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				continue;
			System.out.println(i);
		}
		sc.close();
		
	}

}
