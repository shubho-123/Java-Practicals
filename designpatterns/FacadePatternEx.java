package designpatterns;

import java.util.Scanner;

interface MobileShop{
	public void modelNo();
	public void price(); 
}

class Iphone implements MobileShop{

	@Override
	public void modelNo() {
		// TODO Auto-generated method stub
		System.out.println("Iphone6 ");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("65000");
		
	}
	
}
class Samsung implements MobileShop{

	@Override
	public void modelNo() {
		// TODO Auto-generated method stub
		System.out.println("S20 utra");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("120000");
		
	}
	
}
class Blackbarry implements MobileShop{

	@Override
	public void modelNo() {
		// TODO Auto-generated method stub
		System.out.println("Z1");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("50000");
	}
	
}

class ShopKeeper{
	private MobileShop iphone,samsung,blackberry;
	
	public ShopKeeper()
	{
		iphone=new Iphone();
		samsung=new Samsung();
		blackberry=new Blackbarry();
	}
	public void iphoneSales() {
		iphone.modelNo();
		iphone.price();
	}
	public void samsungSales() {
		samsung.modelNo();
		samsung.price();
	}
	public void blackberrySales() {
		blackberry.modelNo();
		blackberry.price();
	}
}





public class FacadePatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		ShopKeeper shopKeeper=new ShopKeeper();
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("--------------Food Menu------------");
		System.out.println("Enter your choice: ");
		System.out.println("1.Iphone \n2.Samsung \n3.Blackberry\n4.Exit");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: shopKeeper.iphoneSales();
		break;
		case 2: shopKeeper.samsungSales();
		break;
		case 3: shopKeeper.blackberrySales();
		break;
		default: System.out.println("Other then this no food is availabe");
		}
		
	}while(choice!=4);

	}

}
