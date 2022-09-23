package java8features;

public interface Printable {
	float PI=3.14f; //compiler will take as public, static, final float PI=3.14f; //CAPITAL variable name means Final variable, so, it can't be Change it use for Constant
	
	void print(); //compiler will take as public, abstract //if you write public it's ok
	
	//sine java8 we can add default and static method
	
	static void square(int a)
	{
		System.out.println("Square: "+a*a);
	}
	
	default int cude(int x) // if you want to do operations in method so you need to give method type as default() and Static()
	{
		return x*x*x;
	}

}
