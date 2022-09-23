package classandobject;

import java.util.Scanner;

public class Student {
	String name;
	long id;
	int m1,m2,m3,total;
	float percentage;
	
	public Student()
	{	name="";
		id=m1=m2=m3=total=0;
		percentage=0;
		
	}
	public int total(int b,int c,int d)
	{
		m1=b;
		m2=c;
		m3=d;
		total=m1+m2+m3;
		return total;
	}
	public void percent() 
	{
		percentage=(float)total/3;
		System.out.println("Percentage= "+percentage);
	}

	public static void main(String[] args) {
	
		Student sc=new Student();
		
		System.out.println("Enter Student Details:\n ");
		System.out.print("Enter Name of the Student: ");
		Scanner o=new Scanner(System.in);
		String name=o.nextLine();
		System.out.print("\nEnter Id of the Student: ");
		long a=o.nextLong();
		System.out.print("\nEnter 1st Subject Marks: ");
		int b=o.nextInt();
		System.out.print("\nEnter 2nd Subject Marks: ");
		int c=o.nextInt();
		System.out.print("\nEnter 3rd Subject Marks: ");
		int d=o.nextInt();
		sc.total(b,c,d);
		float t=sc.total(b,c,d);
		System.out.println("\nTotal= "+t);
		sc.percent();

	}

}
