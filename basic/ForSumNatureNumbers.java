package basic;

import java.util.Scanner;

public class ForSumNatureNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			s=s+i;
			
		}
		System.out.println("Sum of First 10 Natural Number is: "+s);
		sc.close();
	}

}
