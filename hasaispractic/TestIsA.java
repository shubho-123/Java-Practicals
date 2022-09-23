package hasaispractic;
import java.util.Scanner;

public class TestIsA {
	public static void main(String[] args) {
	
		int id,dd,mm,yy,pin;
		String name,addLine, street, city, state, country;
		float workingDay, workPer;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Id of Employee: ");
		id=sc.nextInt();
		System.out.println("Enter Name of Employee: ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter Date of Birth of Employee: ");
		dd=sc.nextInt();
		mm=sc.nextInt();
		yy=sc.nextInt();
		System.out.println("Enter Address of Employee: ");
		sc.nextLine();
		System.out.println("Enter Address Line : ");
		addLine=sc.nextLine();
		System.out.println("Enter Street : ");
		street=sc.nextLine();
		System.out.println("Enter City : ");
		city=sc.nextLine();
		System.out.println("Enter State  : ");
		state=sc.nextLine();
		System.out.println("Enter Country : ");
		country=sc.nextLine();
		System.out.println("Enter Pincode : ");
		pin=sc.nextInt();
		System.out.println("Working days: ");
		workingDay=sc.nextFloat();
		System.out.println("Work per day : ");
		workPer=sc.nextFloat();	 
		System.out.println();
		System.out.println("**********Employees Default Details:************* ");
		StudentHasA ob=new StudentHasA();
		ob.display();
		System.out.println("**********Employee User Detais:******************");
		EmplyeeIsA e4=new EmplyeeIsA(id,name,new MyDate(dd,mm,yy),new Address(addLine,street,city,state,country,pin),workingDay,workPer);
		e4.calculate();
		e4.display();
		sc.close();
	}
}
