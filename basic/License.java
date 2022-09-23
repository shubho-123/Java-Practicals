package basic;

import java.util.Scanner;

public class License {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		age = sc.nextInt();
		if(age>=18)
			System.out.println("You are Eligible");
		else
			System.out.println("Your are bellow 18");
		sc.close();
	}

}
