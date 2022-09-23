package exceptioneprogram;

public class MultiCatchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[7]=9/0;				//case1---> a[7]=7/0; First Arithmetic Exception occur in this case then ArraIndex Exception
									//case2---> a[7]=10; then ArrayIndexOutOfBoundsException occur
									//it depends upon use what input give.so we need to rectify all the possiblity of exception
										
			
		}
		catch (ArithmeticException e)		//onece corcur will come in catch block then it not go to try block again, so only one exception handling done at a time
											//case1---> for case1 it takes catch(ArithmeticException)
											//case2---> for case2 to taking catch (arrayIndex...Exception)
											//for other case it will take catch(Exception)
		{
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println();

		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Next code.........");

	}

}
