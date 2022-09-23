package basic;

import java.util.Scanner;

public class CallCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int call,bill;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Calls: ");
		call = sc.nextInt();
		if(call<=2000)
		{
			bill=call;
			System.out.print("Bill Amount: "+bill);
		}
		else
		{
			bill=3*call;
		System.out.print("Bill Amount: "+bill);
	sc.close();
	}
	}

}
