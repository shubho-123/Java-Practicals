package basic;

import java.util.Scanner;

public class ForFibonaki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1=0, t2=1,t3,n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Range: ");
		n=sc.nextInt();
		System.out.print(t1+"\t");
		System.out.print(t2+"\t");
		for(int i=0;i<=n;i++)
		{
			t3=t1+t2;
			t1=t2;
			t2=t3;
			System.out.print(t3+"\t");
		}
		sc.close();
	}
	

}
