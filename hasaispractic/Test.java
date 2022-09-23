package hasaispractic;


import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter Id: ");
		int n=sc.nextInt();
		System.out.println("Enter Date Of Birth: ");
		int dd,mm,yy;
		dd=sc.nextInt();
		mm=sc.nextInt();
		yy=sc.nextInt();
		//MyDate d=new MyDate();
	//	d.display();
		
		Person p =new Person();
		p.display();
		
		Person p2=new Person(n,name,new MyDate(dd,mm,yy));
		System.out.println();
		p2.display();
		sc.close();
		
	}

}