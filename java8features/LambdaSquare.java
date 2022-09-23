package java8features;

import java.util.Scanner;


@FunctionalInterface
interface Square
{
	int square(int n); // you can take any variable as we as 'n'
}



public class LambdaSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		
		
		Square referanceVariable = num -> {
			return num*num;
		};
		
		System.out.println("Square : "+referanceVariable.square(n));
	}

}
