package program;

public class MCQ28 {

	public static void main(String[] args) {
		int answer = 0;  //it is inside the method then it's compulsery to inisialized
		try {
			int num = 20;
			int divisor = 0;
			answer = num / divisor;

		} catch (ArithmeticException ae) {
			answer = 0; // line N1
		} catch (Exception e) {
			System.out.println("Invalid division");
		}
		System.out.println("Answer:" + answer);// Line N2
	}

}

/*
Given the below code:
public class Test {

	public static void main(String[] args) {
		int answer;
		try {
			int num = 20;
			int divisor = 0;
			answer = num / divisor;

		} catch (ArithmeticException ae) {
			answer = 0; // line N1
		} catch (Exception e) {
			System.out.println("Invalid division");
		}
		System.out.println("Answer:" + answer);// Line N2
	}

}
What is the result of above program?

A. Answer = 0
B. Invalid calculation
C. Compilation fails only at line n1.
D. Compilation fails only at line n2.
E. Compilation fails at line n1 and line2
*/