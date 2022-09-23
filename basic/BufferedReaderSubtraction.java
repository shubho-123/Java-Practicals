package basic;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderSubtraction {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		int a,b,c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 number: ");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine()); 
		c= a-b;
		System.out.println("Sub: "+c);
	
		
	}
	

}
