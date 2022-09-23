package java8features;
@FunctionalInterface // only to restrict our interface to put only one abstract method() //if we put bimistake more then two abstract method it will suggest us to fin dthe error 
interface Sayable{
	
	//we can put public and static method() inside Functional Interface(Interview question)
	public String sayHello(); //default abstract method
}
//befor class we need to declare interface
public class LambdaWithNoParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable referanceVariable= () -> {  //Type of Lambda Expression is Sayable
			return "Hello User";
		};
		System.out.println(referanceVariable.sayHello());
	}

}
