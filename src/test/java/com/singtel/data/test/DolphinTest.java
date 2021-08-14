package com.singtel.data.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.data.Dolphin;
import com.singtel.data.Fish;
import com.singtel.data.Shark;

public class DolphinTest {

	Dolphin dolphin;
	
	@Before
	public void setUp() {
		dolphin = new Dolphin(new Shark());
	}
	
	@Test
	public void testWalk() {
		assertFalse(dolphin.walk());
	}
	
	@Test
	public void testFly() {
		assertFalse(dolphin.fly());
	}
	
	@Test
	public void testSing() {
		assertFalse(dolphin.sing());
	}
	
	@Test
	public void testSwim() {
		assertTrue(dolphin.swim());
	}
	

	
	
}
