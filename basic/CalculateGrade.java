package basic;

import java.util.Scanner;

public class CalculateGrade {
public static void main(String[] args) {
	int physic,chemitry,maths,total,percentage;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter physics, chemistry, Maths marks: ");
	physic = sc.nextInt();
	chemitry = sc.nextInt();
	maths = sc.nextInt();
	total= physic+chemitry+maths;
	percentage = total/3;
	//condition
	if(physic<35 || chemitry<35 || maths<35)
		System.out.println("Fail");
	else 
	{
		if(percentage>=75)
			System.out.println("Distinction");
		else if(percentage>=60)
			System.out.println("!st class");
		else if(percentage>=45)
			System.out.println("2nd claa");
		else if(percentage>=30)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	sc.close();
}
}

