package basic;
import java.util.Scanner;
public class SimpleInterest {
public static void main(String[] arg) {
	int a,r,y,si;
	System.out.println("Simple Interest calculator \n");
	System.out.println("Enter the amount \n");
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	System.out.println("Enter ROI \n");
	r = sc.nextInt();
	System.out.println("Enter Year \n");
	y =sc.nextInt();
	si = (a*y*r)/100;
	System.out.println("Simple Interest: "+si);
	sc.close();
	
	
}
}
