package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdminPassword {

	@Test
	public void testCorrectUser() {
		AdminPassword obj=new AdminPassword();
		obj.setUsername("admin");
		obj.setPassword("admin123");
		assertTrue(obj.checkAdminPassword());
	}

	@Test
	public void testWrongUser() {
		AdminPassword obj=new AdminPassword();
		obj.setUsername("Shubhendu");
		obj.setPassword("admin1234");
		assertFalse(obj.checkAdminPassword());
	}
}
