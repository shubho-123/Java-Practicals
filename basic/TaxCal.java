package basic;
import java.util.Scanner;
public class TaxCal {
	public static void main(String[] args) {
		int a;
		float t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary: ");
		a = sc.nextInt();
		t = 0.12f*a;
		System.out.println("Tax is: "+t);
		sc.close();
	}

}
