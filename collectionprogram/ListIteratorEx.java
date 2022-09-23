package collectionprogram;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	ArrayList<String> list=new ArrayList<>();
		 	list.add("Ram");
		 	list.add("Shyam");
		 	
		 	ListIterator<String> itr=list.listIterator();
		 	System.out.println("iterating elements in forword direction");
		 	while(itr.hasNext())
		 	{
		 		System.out.println(itr.next());
		 	}
			System.out.println("iterating elements in forword direction");
			while(itr.hasPrevious())
			{
				System.out.println(itr.previous());
			}
	}
}
