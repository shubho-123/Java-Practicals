package java8features;

public class PrintableImpl implements Printable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintableImpl p=new PrintableImpl();
		p.print();
		Printable.square(6); //square() is static so we don't need object we can call ClassName.methodName() / InterfaceName.methodName()
		int c=p.cude(5);  //p object can access the parent class(Printable) features like accessing methods()
		System.out.println("Cube: "+c);

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		float r=10;
		float a=PI*r*r;  ////PI variable can access the parent class(Printable) features like accessing methods()
		System.out.println("Area of Circle: "+a);
	}

}
