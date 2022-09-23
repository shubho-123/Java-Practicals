package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApple {

	@Test //+ve test case
	public void testCorrectColor() {
		Apple appleobj= new Apple();
		appleobj.setColor("Red");
		assertTrue(appleobj.checkColor());
	}
	
	@Test //-ve test case
	public void testWrongColor() {
		Apple appleobj= new Apple();
		appleobj.setColor("bule");
		assertFalse(appleobj.checkColor());
	}


}
