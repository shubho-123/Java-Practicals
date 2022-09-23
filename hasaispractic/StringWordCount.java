package hasaispractic;

import java.util.Scanner;

public class StringWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		n=sc.nextLine();
		String splitedString[]=n.split(" ");	
		System.out.println("Counting String Words: ");

		System.out.println(splitedString.length);
	}

}
