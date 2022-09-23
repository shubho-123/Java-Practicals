package exceptioneprogram;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer i=a;
		System.out.println("Autoboxing");
		Integer j=Integer.valueOf(a);  //Automatic convert primitive into object
		System.out.println(a+" "+i+" "+j);
		System.out.println("\nUnboxing");
		@SuppressWarnings("removal")  //don't need to used I using for removing the Warning mark
		Integer x=new Integer(20); //Integer x=20 you can use because here Integer has "Cut" mark .
		int y=x;
		int z=x.intValue();
		System.out.println(x+" "+y+" "+z);

	}

} 
