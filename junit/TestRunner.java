package junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*JUnitCore : it contains runClasses() in which you can pass test case classes,
it will execute test case and you will get a result if test is passed or failed*/
//Result: hold result of test cases whether test case is pass or not.

//getFailures() : used to retrieve all the Failure messages from the result

//Failure class : holds the description of failed test

public class TestRunner {

	public static void main(String[] args) {
		
	//	Result result= JUnitCore.runClasses(TestSquare.class,TestConuntA.class,TestApple.class,TestAge.class);
	//	Result result= JUnitCore.runClasses(TestAge.class); // Individual checking;
		
		Result result= JUnitCore.runClasses(TestSalesPerson.class);
		
		
	//	Result result= JUnitCore.runClasses(TestAdminPassword.class);
		for (Failure failure : result.getFailures()) 
		{
			System.out.println(failure);
		}
		System.out.println(result.wasSuccessful());
	}

}
 