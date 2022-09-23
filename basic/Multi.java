package basic;
import java.util.Scanner;

public class Multi {
	public static void main(String ar[]) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 no "); //user understood
		
		a = sc.nextInt(); //Reading a value and Storing inside a
		b = sc.nextInt(); //Reading a value and Storing inside a
		
		c = a*b; //Operation
		
		System.out.println("Multi = "+c); //Print output
		sc.close();
	}
}
