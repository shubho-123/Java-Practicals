package program;

import java.util.Scanner;

public class MypProject {
	static String s;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		MypProject mypProject=new MypProject();
		System.out.println("enter 1");
		System.out.println("enter 2");
		int n=sc.nextInt();
		s=mypProject.name(n);
		System.out.println(s);
		sc.close();
	}
	public String name(int n) {
		if(n==1)
		return "hi";
		else
		return "we";
	}

}
