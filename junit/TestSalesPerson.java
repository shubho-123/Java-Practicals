package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSalesPerson {
	
	

	@Test
	public void test() {
		SalesPerson obj=new SalesPerson();
		obj.setSales(90);
		obj.setSalary(60000);
		float com=obj.calCommission();
		
		assertEquals(12000, com, com);
		
	}

}
