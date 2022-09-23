package program;

import java.util.Scanner;

public class Practical10 {

	public static void main(String[] args) {
	
	
		Practical10 practical10=new Practical10();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Number too small");
			System.exit(0);
		}
		else if(n>32767)
		{
			System.out.println("Number too large");
			System.exit(0);
		}
		else
		{
			int bonus=practical10.calculateBonus(n);
			System.out.println(bonus);
		}
			
	}
	public int calculateBonus(int basic) {
		int bonus;
		if(basic>20000)
			bonus=(int)(.17*basic)+1500;
		else if(basic>15000)
			bonus=(int)(.15*basic)+1200;
		else if(basic>10000)
			bonus=(int)(.12*basic)+1000;
		else
			bonus=(int)(.08*basic)+500;
		return bonus;
	}

}
