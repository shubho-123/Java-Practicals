package hasaispractic;

import java.util.Scanner;

public class StringRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n,t1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		n=sc.nextLine();
		System.out.println("What you word want to remove: ");
		t1=sc.nextLine();
		System.out.println("Your String is: ");
		System.out.println(n.replace(t1, ""));
	}

}
