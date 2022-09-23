package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderCircle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		double c,r;
	
		BufferedReader bo= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Radius of circle: ");
		r = Double.parseDouble(bo.readLine());
		c = 3.14f*r*r;
		System.out.println("Area of the Circle is: "+c);
		
	}

}
