package basic;

import java.util.Scanner;

public class ForMultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		
		n = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			r=n*i;
			System.out.print(r+"\t");
		}
		sc.close();
	}

}
