package classandobject;

import java.util.Scanner;


public class ParameterizedWithAndWithoutReturn {
	
	public void add(int a,int b)
	{
		System.out.println("Add: "+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("Sub: "+(a-b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedWithAndWithoutReturn p=new ParameterizedWithAndWithoutReturn();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		int c=sc.nextInt();
		int d=sc.nextInt();
		p.add(c,d);
		p.sub(c,d);
		int w=p.multi(c, d);
		System.out.println("Multi: "+w);
		double e=p.div(c, d);
		System.out.println("Div: "+e);
	}
	public int multi(int g,int h)
	{
		return g*h;
	}
	public double div(double g,double h)
	{
		return g/h;
	}

}
