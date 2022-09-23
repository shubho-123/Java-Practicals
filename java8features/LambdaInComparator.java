package java8features;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaInComparator {

	public static void main(String[] args) {
		
		ArrayList<Product> list =new ArrayList<Product>();
		list.add(new Product(1, "Book" , 1200));
		list.add(new Product(5, "mobile" , 19000));
		list.add(new Product(3, "shirt" , 320));
		list.add(new Product(4, "Per" , 600));
		list.add(new Product(6, "Book" , 1205));
		
		Collections.sort(list , (p1,p2)->{
			
			return p1.productName.compareTo(p2.productName);
		});
		list.forEach(p ->
		{
			System.out.println(p);
		});

	}

}
