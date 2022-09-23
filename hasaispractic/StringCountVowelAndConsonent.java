package hasaispractic;

import java.util.Scanner;

public class StringCountVowelAndConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		int count=0,i,ccount=0,dcount=0,spcount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		n=sc.nextLine();
		int length=n.length();
		System.out.println("Counting String Vowel And Consonent:  ");
		for(i=0;i<length;i++)
		{
			if(n.charAt(i)=='a' || n.charAt(i)=='A' || n.charAt(i)=='e' || n.charAt(i)=='E' || n.charAt(i)=='i'|| n.charAt(i)=='I' || n.charAt(i)=='o' || n.charAt(i)=='O' || n.charAt(i)=='u' || n.charAt(i)=='U')
			count++;
			else if(n.charAt(i)>='a' && n.charAt(i)<='z' || n.charAt(i)>='A' && n.charAt(i)<='Z')
				ccount++;
			else if(n.charAt(i)>='0' && n.charAt(i)<='9')
				dcount++;
			else if(n.charAt(i)==' ')
				spcount++;
	
		}
		System.out.println("Vowel: "+count);
		System.out.println("Consonent: "+ccount);
		System.out.println("Digite: "+dcount);
		System.out.println("Space: "+spcount);
		sc.close();

	}

}
