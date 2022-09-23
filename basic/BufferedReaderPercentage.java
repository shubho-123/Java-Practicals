package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderPercentage {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int physics, chemistry, maths;
		float percentage;
		BufferedReader bo = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Physics Marks: ");
		physics = Integer.parseInt(bo.readLine());
		System.out.print("Enter chemistry  : ");
		chemistry = Integer.parseInt(bo.readLine());
		System.out.print("Enter Maths marks: ");
		maths = Integer.parseInt(bo.readLine());
		percentage = (physics+chemistry+maths)/3;
		System.out.println("Percentage: "+percentage);
		
	}

}
