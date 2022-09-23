package basic;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		float a,amount;
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter Purchese Amount: ");
		 amount = sc.nextFloat();
		 if(amount>=10000)
		 {
			 a= (amount*0.1f);
			// amount = (amount-a);
			 System.out.println("Discount: "+a);
		 }
		 else {
			 a= (amount*0.02f);
		// amount = amount-a;
		 System.out.println("Discount: "+a);
	}
		 sc.close();
	}

}
