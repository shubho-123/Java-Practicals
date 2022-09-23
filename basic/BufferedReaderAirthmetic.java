package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderAirthmetic {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		float a,b;
		BufferedReader bo = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers: ");
		a= Float.parseFloat(bo.readLine());
		b=Float.parseFloat(bo.readLine());
		System.out.println("Add: "+(a+b));
		System.out.println("sub: "+(a-b));
		System.out.println("mul: "+(a*b));
		System.out.println("div: "+(a/b));
	}

}
