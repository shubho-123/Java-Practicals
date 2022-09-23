package program;

import java.util.Scanner;

//import javax.security.sasl.SaslClient;

public class CustomerCare {
	Scanner sc=new Scanner(System.in);
	String cusName;
	long phoneNo;
	int calls;
	float tax,bill;
	
	
	public CustomerCare()
	{
		cusName="";
		phoneNo=calls=0;
		 bill=0;
		 tax=0.12f;
	}
	

	public static void main(String[] args) {
	
		CustomerCare ob=new CustomerCare();
		ob.accept();
		ob.billing();
		float fBill=ob.billing();
		System.out.println("Final Bill of Calls: "+fBill);
	}
	
	
	public void accept()
	{
		System.out.print("Enter Name of Customer: ");
		cusName=sc.nextLine();
		System.out.print("\nPhone no. of Customer: ");
		phoneNo=sc.nextLong();
		System.out.print("\nEnter Calls of Customer: ");
		calls=sc.nextInt();
	}
	public float billing()
	{
		if(calls>500)
		{
			bill=(2.5f*calls);
			
		}
		else if(calls>300 && calls<=500)
			{
				bill=1.25f*calls;
			}
			else if(calls>100 && calls<=300)
		
					bill=0.8f*calls;
			
				else
					bill=0;
	//	int t=tax*calls
					
		
		return bill;
	}
}
