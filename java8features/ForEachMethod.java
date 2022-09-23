package java8features;

import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<String>();
		list.add("Shubho");
		list.add("ajay");
		list.add("jagat");
		
		list.forEach(str -> System.out.println(str));  //Type of Lambda Expression is Consumer
	}

}
