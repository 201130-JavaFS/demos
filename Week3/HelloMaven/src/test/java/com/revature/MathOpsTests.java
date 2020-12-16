package com.revature;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathOpsTests {
	
	public static MathOps mo;
	public static int i;
	public static int j;
	public static int k;
	public static int result; 
	
	@BeforeClass
	public static void setMO() {
		System.out.println("In BeforeClass");
		mo = new MathOps();
		System.out.println(mo.getS());
	}
	
	@Before
	public void setInts() {
		System.out.println("In Before");
		i = 7;
		j = 5;
		k = 0;
	}
	
	
	@After
	public void clearResult() {
		System.out.println("In After");
		result = 0;
	}
	
	@AfterClass
	public static void clearMO() {
		System.out.println("In AfterClass");
		mo = null;
	}
	
	@Test
	public void testAdd() {
		System.out.println("Testing add");
		result = mo.add(i, j);
		assertTrue(result == 12);
	}

	@Test
	public void testSubtract() {
		System.out.println("Testing Subtract");
		result = mo.subtract(i, j);
		assertTrue(result == 2);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		System.out.println("Testing dividing by zero");
		mo.divide(i, k);
	}
	
}
