package designpatterns;

class SingleObject
{
	//create object
	private static SingleObject instance=new SingleObject();
	int a;
	
	//make private constructor so that class can not be instantiate
	private  SingleObject()
	{
		a=10;
	}
	//get the only object available
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void show() {
		System.out.println("Accseing method using single object");
	}
	
	public void accessVariable() {
		System.out.println("Accessing variavle from differnt class");
		System.out.println(a);
	}
}






public class SingletonePatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject obj=SingleObject.getInstance();
		obj.show();
		obj.accessVariable();
	}

}
