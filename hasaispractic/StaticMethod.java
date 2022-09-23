package hasaispractic;

public class StaticMethod {
	
	
	static								//static class 
	{
		System.out.println("Exicute befor Main(): ");
	}
	
	public static void add(int a, int b) //static method
	{
		System.out.println("add: "+(a+b));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(2,4);						//do not need to create object(because it's a static )put method name and pass values 
		StaticMethod.add(25,12);		//ClassName.MethodName(value,value)
	}

}
