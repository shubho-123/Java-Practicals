package classandobject;

import java.util.Scanner;

public class ArithmaticWithAndWithoutReturnType {

	Scanner sc=new Scanner(System.in);
	int a,b;
	public void method() {
		System.out.println("Enter 2 Nos: ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void add()
	{
		
		System.out.println("Add: "+(a+b));
	}
	public void sub()
	{
		
		System.out.println("Sub: "+(a-b));

	}
	public int multi()
	{
		
		return a*b;
	}
//	public double div()
//	{
//		double m=(double)(a/b);
//		return m;
//		
//		/return a/b;
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticWithAndWithoutReturnType obj= new ArithmaticWithAndWithoutReturnType();
		obj.method();
		obj.add();
		obj.sub();
		int c=obj.multi();
		System.out.println("Muti: "+c);
//		double d=obj.div();
//		System.out.println("Div: "+d);

}
}