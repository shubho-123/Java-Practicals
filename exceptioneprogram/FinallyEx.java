package exceptioneprogram;

import java.util.Scanner;

public class FinallyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Case1 : When exception does not occur");
		try {
			String s="Shubhendu";
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Case1: always execute");
		}
		System.out.println("Rest of the Code: ........");
		System.out.println("\nWhen Exception occured and Handeled.");
		try {
			String s="abc";
			System.out.println(Integer.parseInt(s));
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Case2: Always executed");
		}
		System.out.println("rest of Code........");
		System.out.println("Case 3:When exception ocuur but does not handeled");
	}
}