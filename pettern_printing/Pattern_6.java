package pettern_printing;

import java.util.Scanner;

public class Pattern_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=1;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(String.format("%2d", k));
				k++;
			
			System.out.println();
		}

	}

}
}
