package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSquare {

	@Test // used to mark a method as a test case
	public void test() {
		JUnitEx1 testCaseObj= new JUnitEx1();
		int sq=testCaseObj.square(6);
		
		assertEquals(36, sq);
	}

}
