package collectionprogram;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> s=new PriorityQueue<String>();
		s.add("Mango");
		s.offer("Hi");
		s.offer("Shubhendu" );
		s.offer("mohit");
		s.offer("tree");
	//	s.offer(null);
		System.out.println("Inseting elements in queue: Randome order");
		for (String string : s) {
			System.out.println(string);
		}
		
		System.out.println("\nHead of the Queue: "+s.element());
		

	}

}
