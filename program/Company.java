package program;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double d=0;
		int choice;
		char ch;
		try (Scanner sc = new Scanner(System.in)) {
			do {
			System.out.println("Choose One Option: \nProduct\t\t\t\tCode\nComputer Stationary\t\t1\nFixed disks	\t\t2\nComputers\t\t\t3");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Computer stationary");
					System.out.print("Enter your Order Amount:");
						i=sc.nextInt();
						if(i>=500)
						{
							d=(.12f*i);
						}
			
						else
						{
							if(i>=300 && i<500)
							{
								d=(0.8f*i);
							}
							else
								if(i<300)
								{
									d=(0.02f*i);
								}
						}
						System.out.println("Discount: "+d);
						break;
			case 2: System.out.println("Fixed Disks");
					System.out.print("Enter your Order Amount:");
					i=sc.nextInt();
					if(i>=2000)
					{
						d=(.1f*i);
					}

					else
					{
						if(i>=1500 && i<2000)
						{
							d=(0.05f*i);
						}
						
					}
					System.out.println("Discount: "+d);
			break;
			case 3: System.out.println("Computers");
					System.out.print("Enter your Order Amount:");
					i=sc.nextInt();
					if(i>=5000)
					{
					d=(.1f*i);
					}

					else
					{
						if(i>=2500 && i<5000)
						{
						d=(0.05f*i);
						}
					
					}
					System.out.println("Discount: "+d);
			break;
				default:System.out.println("Wrong Input");
			}
			System.out.println("Do You Want do it again: (Y/N) : ");
			ch=sc.next().charAt(0);
			}
			while( ch=='Y' || ch=='y');
		}
		System.out.println("Thank You");
	
	}
}


