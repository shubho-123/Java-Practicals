package exceptioneprogram;

public class ThrowExample {

	
	public static void validate(int age)
	{
		if(age>=18)
		System.out.println("Welcome to Vote");
		else
			throw new ArithmeticException("Age not Valid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate(9);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("After Code.....");

	}

}
