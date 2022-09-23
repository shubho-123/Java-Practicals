package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTriangle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		float b,h,a;
		BufferedReader bo = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter hight: ");
		h = Float.parseFloat(bo.readLine());
		System.out.println("Enter base: ");
		b = Float.parseFloat(bo.readLine());
		a=(h*b*0.5f);
		System.out.println("Area of Triangle: "+a);
		
		
	}

}
