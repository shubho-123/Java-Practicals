package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssertionsMethods {

	@Test
	public void test() {
		String str1=new String("Welcome");
		String str2=new String("Welcome");
		String str3="hello";
		String str4="hello";
		String str5=null;
		
		int a=5;
		int b=5;
		assertEquals(str2, str2);
		
		assertTrue(a==b);
		
		//assertFalse(a==b)
		
		assertFalse(a>b);
		
		assertSame(str3, str4);
		
		assertNotSame(str1, str2);
		
		assertNull(str5);
		
		assertNotNull(str3);
		
		String array1[]= {"one","two","Three"};

		String array2[]= {"one","two","Three"};
		
		assertArrayEquals(array1, array2);
	}

}
