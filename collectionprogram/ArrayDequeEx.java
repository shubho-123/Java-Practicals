package collectionprogram;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> s=new ArrayDeque<String>(); //
		s.add("Mango");
		s.offer("Hi");
		s.offer("Shubhendu" );
		s.offer("mohit");
		s.offerLast("The End");
		s.offer("tree");
		s.offerLast("At last");
		s.offerFirst("Welcome");
		
		for (String string : s) {
			System.out.println(string);
		}
		
		
		System.out.println("\nRemoving First Element: ");
		s.pollFirst();
		for (String string : s) {
			System.out.println(string);
		}
		
		System.out.println("\nRemoving last element: ");
		s.pollLast();
		for (String string : s) {
			System.out.println(string);
		}
		
		System.out.println("\n\nRemove: "+s.remove()+"\n"); //removing fist because First In First out(FIFO)
		for (String string : s) {
			System.out.println(string);
		}
	}

}
