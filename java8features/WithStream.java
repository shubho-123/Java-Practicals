package java8features;

import java.util.ArrayList;

public class WithStream {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("Ajay");
		list.add("Shubhendu");
		list.add("manas");
		list.add("Gopi");
		list.add("Riya");
		list.add("raj");
		
		long count =list.stream().filter(str -> str.length()<5).count();
		System.out.println("There are "+count+" with length less then 5");
		
	}

}
