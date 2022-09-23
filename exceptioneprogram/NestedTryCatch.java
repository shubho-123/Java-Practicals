package exceptioneprogram;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try
	{
		try {
		int a[]=new int[5];
		a[7]=9/0;
	}
	catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	System.out.println("Next code.......");
	try {
		String s=null;
		System.out.println(s.length());
	}
	catch(NullPointerException e)
	
	{
		e.printStackTrace();
	}
	System.out.println("gdiusaiudiagdiugiw");
	}
}
