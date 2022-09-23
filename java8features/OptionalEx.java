package java8features;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[10];
		//str[5]=null;
		//str[5]="Shubhendu";
		Optional<String> obj= Optional.ofNullable(str[5]); //you need to pass a value which you want to test
		
		if(obj.isPresent()) //isPresent() will check if value is present or not
		{
			String up= str[5].toUpperCase();
			System.out.println(up);
		}
		else
		{
			System.out.println("Value not present at 5th possition");
		}

	}

}
