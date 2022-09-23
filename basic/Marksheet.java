package basic;
import java.util.*;
public class Marksheet {
	public static void main(String[] args) {
		int a,b,c;
		float pr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Maths Mark\t");
		a = sc.nextInt();
		System.out.println("Enter Chemistry Mark\t");
		b = sc.nextInt();
		System.out.println("Enter Biology Mark\t");
		c = sc.nextInt();
		pr = (a+b+c)/3;
		System.out.println("percentage\t"+pr);
		sc.close();
	}

}
