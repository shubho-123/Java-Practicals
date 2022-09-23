package abstraction;

import java.util.Scanner;

 abstract class Marks
 {
	public abstract void getPercentage();
	

}
 class A extends Marks
{	
	int s1,s2,s3;
	float per;
	public A(int s1,int s2,int s3)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		
	}
	

	@Override
	public void getPercentage() {
		// TODO Auto-generated method stub
		per=(float)(s1+s2+s3)/3;
		System.out.println("Percentage of A: "+per);
		
	}
}
 class B extends Marks
{	
	int s1,s2,s3,s4;
	float per;

	public B(int a,int b,int c,int d)
	{
		s1=a;
		s2=b;
		s3=c;
		s4=d;
	}
	public void getPercentage()
	{
	
		per=(float)(s1+s2+s3+s4)/4;
		System.out.println("Percentage of B: "+per);
	}
	
}
public class TestMarks{
	public static void main(String[] args) {
		System.out.println("Enter StudentA 3 subsjects number: ");
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
				
		A obj=new A(a,b,c);
		obj.getPercentage();
		
		System.out.println("Enter StudentB 4 subsjects number: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		B obj2=new B(a,b,c,d);
		obj2.getPercentage();
		
		
	}
}
