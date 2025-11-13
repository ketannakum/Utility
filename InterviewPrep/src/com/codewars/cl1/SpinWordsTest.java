package com.codewars.cl1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpinWordsTest {

	@Test
	public void testSpin() {
		assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
	    assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
	}

	@Test
	public void testNoSpin() {
	    assertEquals("This is a test", new SpinWords().spinWords("This is a test"));
	}
	
}
