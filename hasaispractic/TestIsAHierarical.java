package hasaispractic;

import java.util.Scanner;

public class TestIsAHierarical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
		System.out.println("Enter Date Of Birth: ");
		int dd,mm,yy;
		dd=sc.nextInt();
		mm=sc.nextInt();
		yy=sc.nextInt();
		System.out.println("Sub 1 Marks: ");
		s1=sc.nextInt();
		System.out.println("Sub 2 Marks: ");
		s2=sc.nextInt();
		System.out.println("Sub 3 Marks: ");
		s3=sc.nextInt();
		
		MyDate d=new MyDate();
	//	d.display();
		Person p =new Person();
		p.display();
		StudentIsAHierical r2=new StudentIsAHierical();
	//	r2.
		StudentIsAHierical r1=new StudentIsAHierical(id, name,new MyDate(dd,mm,yy), s1, s2, s3);
	}

}
