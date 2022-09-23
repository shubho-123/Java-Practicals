package hasaispractic;

import java.util.Scanner;

public class Test3MultiLevelInheritance {

	public static void main(String[] args) {
		int id,dd,mm,yy,pin,sales;
		String name,addLine, street, city, state, country;
		float workingDay, workPer;
		char ch;
		Scanner sc =new Scanner(System.in);
		do {
		
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
		System.out.println("Enter Your No of Sales:  ");
		sales=sc.nextInt();
		
		SalesPerson p=new SalesPerson(id, name, new MyDate(dd,mm,yy), new Address(addLine,street,city, state,country,pin), workingDay, workPer, sales);
		
		
		p.calculate();
		p.display();
		System.out.println("Want to Repeat: (Y/N) ");
		ch=sc.next().charAt(0);
		
	}
		while(ch=='y' || ch=='Y');
		System.out.println("Thank You");
		sc.close();
		

	}

}
