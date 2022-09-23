package classandobject;

import java.util.Scanner;

public class Employee {
long id;
int saly,rpd,wday;
String name;

	public Employee()
	{
		 id=76763l;
		 name="Shubhendu Bauri";
		 rpd=1100;
		 wday=26;
	
	}
	public Employee(long a,String s,int w,int r)
	{
		id=a;
		name=s;
		rpd=w;
		wday=r;
	}
 public void output()
 {
	 saly=rpd*wday;
	 System.out.println("\nId no. of Employee: "+id);
	 System.out.println("\nName of Employee:  "+name);
	 System.out.println("\nPut Working days: "+wday);
	 System.out.println("\nRate per day: "+rpd);
	 System.out.println("\nSalary is:"+saly);
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob1= new Employee();
		ob1.output();
		Scanner sc =new Scanner(System.in);
		System.out.println("\n************ User Inpur**********");
		System.out.print("\nEnter Yor Id No.: ");
		long a=sc.nextLong();
		System.out.print("\nEnter Yor Name: ");
		sc.nextLine();
		String b=sc.nextLine();
		System.out.print("\nEnter Yor Warking Day: ");
		int c=sc.nextInt();
		System.out.print("\nEnter Yor rate per salary: ");
		int d=sc.nextInt();
		System.out.println("\n***********Output of User************");
		Employee ob2=new Employee(a,b,c,d);
		ob2.output();
		
		sc.close();
	}

}
