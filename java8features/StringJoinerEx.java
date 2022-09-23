package java8features;

import java.util.StringJoiner;

public class StringJoinerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner joiner1 = new StringJoiner(","); // you can use any string like "-","_","A"  //StringJoiner is a Inbuilt class and joiner1 obj is using the feature or methods() from StringJoiner class
		joiner1.add("Ram"); // add() presents in collection class
		joiner1.add("Shyam");
		joiner1.add("Gopi");
		joiner1.add("Aishwarya");
		joiner1.add("Shubhendu");
		
		System.out.println("Useing Delimiter: "+joiner1);
		
		StringJoiner joiner2 =new StringJoiner(",", "*(<", ">)*"); //( "DElimiter" , "prefix" , "Suffix")
		joiner2.add("Ram");
		joiner2.add("Shyam");
		joiner2.add("Gopi");
		joiner2.add("Aishwarya");
		joiner2.add("Shubhendu");
		
		System.out.println("\nUsing Delimiter,prefix,suffix: "+joiner2);
		
		System.out.println("\nConverting StringJioner into string for using the features of String methods()");
		
		String convertedObj= joiner1.toString(); //Creating object of String class = joiner1 obj call the toString() present in StringJoiner Class that String Assigning into object of String class(convertedObj)
		System.out.println("\nJoiner to Sting: "+convertedObj); //Taking the String
		System.out.println("Char at 5th index: "+convertedObj.charAt(5));    //convertedObj is using the String method()
		System.out.println("Length of the String: "+convertedObj.length());  //convertedObj is using the String method()
		
	}

}
