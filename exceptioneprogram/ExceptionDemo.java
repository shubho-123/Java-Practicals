package exceptioneprogram;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {									//one try and one catch
														//we can use multiple try and multiple catch for multiple exception handling
			int c=10/0;
			System.out.println(c);
		}
		catch (ArithmeticException e)
		{
			//System.out.println(e); //we can use one of them
			e.printStackTrace();
		}
		
		System.out.println("Next Code...........");
		System.out.println("Hi");
		
	}

}
