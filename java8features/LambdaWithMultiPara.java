package java8features;
@FunctionalInterface
interface Addable
{
	int add(int a, int b); // public is default method in interface // if you are not passing any modifier it will take by default public
}


public class LambdaWithMultiPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable referanceVariable1= (x,y) -> x+y; //Type of Lambda Expression is Addable
		
		Addable referanceVariable2= (p,q) -> {    //Type of Lambda Expression is Addable
			
			return p+q;
		};
		
		System.out.println("Add: "+referanceVariable1.add(12, 60));
		System.out.println("Add: "+referanceVariable2.add(154, 254));
	}

}
