package hasaispractic;

import java.util.Scanner;

public class Test2HasA {
	public static void main(String[] args) {
		int id,dd,mm,yy,pin;
		String name,addLine,street,country,city,state;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Id: ");
		id=sc.nextInt();
		System.out.print("Enter Name: ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.print("Enter Date of Birth:");
		dd=sc.nextInt();
		mm=sc.nextInt();
		yy=sc.nextInt();
		System.out.println("Enter Address: ");
		System.out.print("Enter Address Line: ");
		sc.nextLine();
		addLine=sc.nextLine();
		System.out.print("Enter Street: ");
		street=sc.nextLine();
		System.out.print("Enter City: ");
		city=sc.nextLine();
		System.out.print("Enter State: ");
		state=sc.nextLine();
		System.out.print("Enter Country: ");
		country=sc.nextLine();
		System.out.println("Enter Pincode: ");
		pin=sc.nextInt();
		
		System.out.println();
		System.out.println("Students Default Details: ");
		
		StudentHasA s1=new StudentHasA();
		s1.display();
		System.out.println();
		System.out.println("Studdents User Input: \n");
		StudentHasA s2=new StudentHasA(id,name,new MyDate(dd,mm,yy),new Address(addLine,street,city,state,country,pin));
		s2.display();
		sc.close();
	}

}
