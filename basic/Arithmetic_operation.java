package basic;
import java.util.Scanner;

public class Arithmetic_operation {
	public static void main(String[] args) {
			float a,b;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter one no ");
			a = sc.nextInt(); 
			System.out.println("Enter another no ");
			b = sc.nextInt();
			//Arithmetic Operation
			System.out.println("Addition      = "+(a+b));
			System.out.println("Subtraction   = "+(a-b));
			System.out.println("Multiplicatio = "+(a*b));
			System.out.println("Division      = "+(a/b));
			
			sc.close();
	
			}

}
