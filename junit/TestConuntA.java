package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConuntA {

	@Test
	public void test() {
		JUnitEx1 testCaseObj= new JUnitEx1();
		int count=testCaseObj.countA("Education");
		
		assertEquals(1, count);
	}

}
