package basic;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int salary,shift=0,savings,total,extra;
	 Scanner sc =new Scanner(System.in);
	 salary=sc.nextInt();
	 
	 
	   if(salary>=80000) {
		 System.out.println("Salary too large");
	   }
	   else {
		   if(salary<=0) {
		   System.out.println("Salary too small");
		   }
	       else
	          {
	          shift =sc.nextInt();
	          if(shift>0)
	              {
		             extra = (int)(salary*0.02*shift);
	            	 savings= (int)(salary*0.5);
	            	 total = (savings+extra);
		             System.out.println(total);
	              }
	         else
		     System.out.println("Shift too small");
	        }
	     }
	     sc.close();
	}

}
