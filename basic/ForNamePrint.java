package basic;

import java.util.Scanner;

public class ForNamePrint {
	public static void main(String[] args) {
		String n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		n=sc.nextLine();
		for(int i=0;i<5;i++)
		{
			System.out.println(n);
		}
		sc.close();
	}

}
