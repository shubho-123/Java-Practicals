package hasaispractic;

import java.util.Scanner;

public class StringPalindromme {

	public static void main(String[] args) {
	
		String n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		n=sc.next();								//n=madam
		boolean b=isPalindrome(n);
		if(b==true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	
	
	public static boolean isPalindrome(String n) //n=madam
	{
		int length=n.length();					//5
		for(int i=0; i<length/2 ;i++)
		{
			if(n.charAt(i) != n.charAt(length-i-1))
			return false;
		}
		return true;
}
}
