package exceptioneprogram;

public class CustomExceptionDemo { 
	
	public static void validate(int age)throws InvalidAgeException
	{
		if(age>=18)
		System.out.println("Welcome to vote");
		else
			throw new InvalidAgeException("Not valid" );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		validate(9);
	}
		catch(InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println("Next Code");
}
}
