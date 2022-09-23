package java8features;

@FunctionalInterface
interface Sayable1{
	public String sayHello(String str);
	
}

public class LambdaWithSinglePara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable1 referanceVariable= (name) -> { //Type of Lambda Expression is Sayable1
			return "Hello "+name;
		};
		System.out.println(referanceVariable.sayHello("Shubhendu"));
	}

}
