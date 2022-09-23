package abstraction;

import java.util.Scanner;

abstract class Bank1{
		public abstract float getrateOfInterrest();
	}
	class SBI extends Bank1{

		@Override
		public float getrateOfInterrest() {
			// TODO Auto-generated method stub
			return 7.4f;
		}
		
	}
	class CBI extends Bank1{

		@Override
		public float getrateOfInterrest() {
			// TODO Auto-generated method stub
			return 6.8f;
		}
		
	}
	
	public class TestBank {
	public static void main(String[] args) {
		
		Bank1 b1, b2; 
		b1=new SBI();
		b2=new CBI();
		System.err.println("Enter Amount and NO of Years:");
		Scanner sc=new Scanner(System.in);
		float p=sc.nextFloat();
		float n=sc.nextFloat();
		float rsbi=b1.getrateOfInterrest();
		float rcbi=b2.getrateOfInterrest();
		
		System.out.println("Simple Interrest of SBI: "+(p*n*rsbi/100));

		System.out.println("Simple Interrest of CBI: "+(p*n*rcbi/100));
		sc.close();
		
	}

}
