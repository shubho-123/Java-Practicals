package basic;
import java.util.Scanner;

public class AreaTriangle {
	public static void main(String[] args) {
		float a,h,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height of the Triangle\t");
		h = sc.nextFloat();
		System.out.println("Enter Base of the Triangle\t");
		b = sc.nextFloat();
		a = 0.5f*b*h;
		System.out.println("Area of Triangle: "+a);
		sc.close();
		
	}

}
