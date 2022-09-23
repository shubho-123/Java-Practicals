package collectionprogram;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s=new Stack<String>();
		s.push("Ram");
		s.push("Gopi");
		s.push("123");
		s.push("Rita");
		
		System.out.println(s);
		
		System.out.println("Revoing element: "+s.pop());
		
		System.out.println(s);
		
		System.out.println("Searching element: "+s.search("123"));
		
		System.out.println("Searching element: "+s.search("Shubhendu"));
		
		System.out.println("Searching element: "+s.search("Ram"));

	}

}
