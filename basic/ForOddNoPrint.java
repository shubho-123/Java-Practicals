package basic;

import java.util.Scanner;

public class ForOddNoPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		for(int i=25;i<=50;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+"\t" );
			}
			
		}
		sc.close();
	}

}
