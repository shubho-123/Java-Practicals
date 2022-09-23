package exceptioneprogram;

import java.util.Scanner;

public class BadFoodExceptionDemo {

	public static void food(String fruit)throws BadFoodException
	{
		if(fruit.equalsIgnoreCase("Maango"))
			System.out.println("I like "+fruit);
		else
			throw new BadFoodException("I don't like "+fruit);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a fruit name: ");
			try {
				food("Apple");
				
			}
			catch (BadFoodException e)
			{
				e.printStackTrace();
			}
			System.out.println("Next Code....");
	}

}
