package hasaispractic;

import java.util.Scanner;

public class Test4MultiLevelInheritance {

	public static void main(String[] args) {
		int id,dd,mm,yy;
		float billAmount,quantity,price;
		String prodName,name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		id=sc.nextInt();
		
		System.out.println("Enter Name: ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter Date of Delivery: ");
		dd=sc.nextInt();
		mm=sc.nextInt();
		yy=sc.nextInt();
		System.out.println("Enter BillAmount: ");
		billAmount=sc.nextFloat();
		System.out.println("Enter Qunatity: ");
		quantity=sc.nextFloat();
		System.out.println("Eneter price: ");
		price=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter Product Name: ");
		prodName=sc.nextLine();
		Discount d1=new Discount(id,name,new MyDate(dd,mm,yy),billAmount,quantity,price,prodName);
		d1.calculate();
		d1.display();
		sc.close();

	}

}
