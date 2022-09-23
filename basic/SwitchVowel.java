package basic;

import java.util.Scanner;

public class SwitchVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A character: ");
		ch = sc.next().charAt(0);
		switch (ch)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Vowel");
			break;
		default: System.out.println("Consonent");
		}
	sc.close();
	}
	

}
