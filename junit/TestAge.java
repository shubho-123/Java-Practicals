package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAge {

	@Test
	public void testCorrect() {
		Age obj=new Age();
		obj.setAge(18);
		assertTrue(obj.checkAge()); //obj.checkAge() returns True then it give ture
	}
	@Test
	public void testWrong() {
		Age obj=new Age();
		obj.setAge(17);
		assertFalse(obj.checkAge()); //obj.checkAge() returns false then it give ture
	}
}
