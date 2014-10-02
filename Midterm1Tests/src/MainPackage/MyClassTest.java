package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReturnTrue() {
		assertTrue("Tests if MyClass.ReturnTrue() returns true", MyClass.ReturnTrue());
	}

	@Test
	public void testAddTwoNumbers() {
		assertEquals("Tests to see if MyClass.AddTwoNumber(8,7) == 15", 15, MyClass.AddTwoNumbers(8, 7));
	}

}
