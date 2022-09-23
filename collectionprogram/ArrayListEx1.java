package collectionprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList(); //non-generic, means you can pass any type of list.
		list.add("Raj");
		list.add("ajay");
		list.add("Shubho");
		list.add(21);
		list.add(25.314641);
		
		Iterator itr=list.iterator();
		System.out.println("Non-Generic List.........");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ArrayList<String> list2=new ArrayList<String>(); //Generic ,means you can only pass Specific type of list
		list2.add("Hi");
		list2.add("Shubhenu");
		list2.add("Bauri");
		
		Iterator<String> itr2=list2.iterator();
		System.out.println("\nGeneric list:..........");
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}

}
