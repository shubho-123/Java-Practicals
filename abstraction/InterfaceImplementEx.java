package abstraction;

public class InterfaceImplementEx implements Printable,Showable {

	
	@Override
	public void show() {
	System.out.println("Show() method of Showable Interface: ");
		
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Calculate() method of Printable: ");
		float r=10f;
		//PI=3.2f;
		System.out.println("Area : "+PI*r*r);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplementEx i=new InterfaceImplementEx();
		i.show();
		i.calculate();
		i.square(9);
		System.out.println("Cube: "+Printable.cube(9));
	}


}
