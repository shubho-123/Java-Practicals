package basic;

import java.util.Scanner;

public class ArrayEvenPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,size;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Size of Array: ");
			size = sc.nextInt();
			System.out.print("Enter"+size+"array elements: ");
			int a[]=new int[size];
			for(i=0;i<a.length;i++){
				a[i]=sc.nextInt();
			}
			System.out.println("Your Even elements: ");
			
				for(i=0;i<size;i++) {
					if(a[i]%2==0) {
					System.out.println(a[i]);
				}
				}
			sc.close();
		}
		}
}