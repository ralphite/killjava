package com.ralphwen.javatest;

import static org.junit.Assert.*;

import org.junit.*;

public class StringReverseTest {

	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("Before Class");
	}
	@Before
	public void testBefore() {
		System.out.println("Before");
	}
	@Test
	public void testNormalString() {
		assertEquals("123abc", StringReverse.ReverseIt("cba321"));
	}
	@After
	public void tearDown() {
		System.out.println("After");
	}
	@AfterClass
	public static void tearDownClass() {
		System.out.println("After Class");
	}

}
