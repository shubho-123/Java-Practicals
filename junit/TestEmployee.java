package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployee {

	@Test
	public void testYearlySalary() {
		Employee obj= new Employee();
		obj.setSalary(30000);
		int a=obj.calculateYearlySalary();
		
		assertEquals(360000, a);
		
	}
	
	@Test
	public void testAppraisal() {
		Employee obj= new Employee();
		obj.setSalary(30000);
		//obj.setAppraisal(2000);
		int b=obj.calculateAppraisal();
		
		assertEquals(362000, b);
		
	}

}
