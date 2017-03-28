package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExampleTest {

	@Test
	public void testFirst2Positions() {
		
		TestExample obj = new TestExample();
		assertEquals("RTAA", obj.First2Positions("RTAA"));
		assertEquals("1BCD", obj.First2Positions("ABCD"));
		assertEquals("11CD", obj.First2Positions("ABCD"));
	}

}
