package collectionprogram;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> tr=new TreeMap<String, String>();
		tr.put("B1", "Raju");
		tr.put("c3", "Kamal");
		tr.put("h5", "Shubhendu");
		System.out.println("Implementing TreeMap: ");
		for(Map.Entry<String, String> emp: tr.entrySet()) //for each and every elenment inside treeMap
															//Entery:Interface;  emp : reference variable;
		{
			System.out.println("Menu code: "+emp.getKey()+" Menu NAme: "+emp.getValue());
		}

	}

}
