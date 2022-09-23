package program;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your limite: ");
			n=sc.nextInt();
		}
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
