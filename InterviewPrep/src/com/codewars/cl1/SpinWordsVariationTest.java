package com.codewars.cl1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpinWordsVariationTest {

	@Test
	public void testSpin() {
		assertEquals("emocleW", new SpinWordsVariation().spinWords("Welcome"));
	    assertEquals("Hey wollef sroirraw", new SpinWordsVariation().spinWords("Hey fellow warriors"));
	}

	@Test
	public void testNoSpin() {
	    assertEquals("This is a test", new SpinWordsVariation().spinWords("This is a test"));
	}

}
