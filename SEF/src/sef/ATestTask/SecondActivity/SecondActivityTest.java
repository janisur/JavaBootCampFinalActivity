package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;


public class SecondActivityTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

//	//Example ->
//	@Test
//	public void testGetSumPositiveValue() {
//		assertEquals(15, (theCalculator.getSum(5, 10)));
//		assertEquals(15, (theCalculator.getSum(10, 5)));
//	}
//
//	//Example ->
//	@Test
//	public void testGetSumNegativeValue() {
//		assertEquals(5, (theCalculator.getSum(-5, 10)));
//		assertEquals(-5, (theCalculator.getSum(5, -10)));
//	}
	
// DISCLAIMER: DOING TESTING WITH VERY LIMITED TIME RESOURCES DURING SELENIUM BOOTCAMP
	
		public void testSum() {
		
		double a = 5;
		double b = 15;			
		
		assertEquals(20.0, (theCalculator.sum(a,b)));
		assertEquals(20.0, (theCalculator.sum(b,a)));		

		a = -5;		
		b = 5;		
		
		assertEquals(0.0, (theCalculator.sum(a,b)));
		assertEquals(0.0, (theCalculator.sum(b,a)));
		
		a = -5;		
		b = -25;		
		
		assertEquals(-30.0, (theCalculator.sum(a,b)));
		assertEquals(-30.0, (theCalculator.sum(b,a)));
		
		}
		
		public void testSubtract() {
			
		double a = 3.0;
		double b = 2.0;		
			
		assertEquals(1.0, (theCalculator.subtract(a,b)));					
		//assertEquals(-1.0, (theCalculator.subtract(b,a)));

		a = 5.0;
		b = -4.0;
			
		assertEquals(9.0, (theCalculator.subtract(a,b)));		
		//assertEquals(-9.0, (theCalculator.subtract(b,a)));	
		
		a = -10.0;
		b = -5.0;

		//assertEquals(-5.0, (theCalculator.subtract(a,b)));
		assertEquals(5.0, (theCalculator.subtract(b,a)));			
		}
		
}

//DISCLAIMER: DOING TESTING WITH LIMITED TIME RESOURCES DURING SELENIUM BOOTCAMP