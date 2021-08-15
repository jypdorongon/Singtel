package com.singtel.data.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.data.Butterfly;

public class ButterflyTest {

	Butterfly butterfly;

	@Before
	public void setUp() {
		butterfly = new Butterfly();
	}

	@Test
	public void testWalk() {
		assertFalse(butterfly.walk());
	}

	@Test
	public void testFly() {
		assertTrue(butterfly.fly());
	}

	@Test
	public void testSing() {
		assertFalse(butterfly.sing());
	}

	@Test
	public void testSwim() {
		assertFalse(butterfly.swim());
	}
	
	

}
