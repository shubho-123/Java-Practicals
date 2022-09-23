package collectionprogram;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1,"Ram");
		m.put(2, "Shubho");
		m.put(3, "ajay");
		m.put(4, "Gopi");
		
		for(Map.Entry<Integer, String> em: m.entrySet())
		{
			System.out.println(em.getKey()+" "+em.getValue());
		}
			
		System.out.println(m.get(4));
		
		System.out.println("Getting In Random order but for integer it's geting Ascending");
		Map<String, String> m1=new HashMap<String, String>();
		m1.put("12","Ram");
		m1.put("c", "Shubho");
		m1.put("1", "ajay");
		m1.put("y", "Gopi");
		
		
		for(Map.Entry<String, String> em: m1.entrySet())
		{
			System.out.println(em.getKey()+" "+em.getValue());
		}
			
		System.out.println("\n"+m1.get(12));
	}

}
