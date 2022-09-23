package abstraction;

public interface Printable {
	float PI=3.14f;			//public static final float PI=3.14f;
	void calculate();		//public abstract void calculate();
	
	static int cube(int a)
	{
		return a*a*a;
	}
	
	default void square(int x)
	{
		System.out.println("Squre : "+(x*x));
	}

}
