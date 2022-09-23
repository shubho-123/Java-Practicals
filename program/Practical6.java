package program;

import java.util.Scanner;

public class Practical6 {
	int m;
	public int capacity(int x)
	{
		if(x>=100 && x<=125)
			m=75;
		else if(x>=126 && x<=135)
			m=70;
		else if(x>=136 && x<=150)
			m=60;
		else if(x>=151 && x<=200)
			m=50;
		else if(x>=201 && x<=220)
			m=35;
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cc,result;
		Practical6 p=new Practical6();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CC of Bike: ");
		cc=sc.nextInt();
		if(cc>220)
			System.out.println("Number is too Large");
		else if(cc<100)
			System.out.println("Number is too  Small");
		else
		{
			result=p.capacity(cc);
			System.out.println(result);
		}
		

	}

}
