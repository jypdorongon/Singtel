package com.singtel.data.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.data.Chicken;
import com.singtel.data.Rooster;

public class RoosterTest {
	
	Chicken rooster;
	
	@Before
	public void setUp() {
		rooster = new Rooster();
	}
	
	@Test
	public void testWalk() {
		assertTrue(rooster.walk());
	}
	
	@Test
	public void testFly() {
		assertFalse(rooster.fly());
	}
	
	@Test
	public void testSing() {
		assertTrue(rooster.sing());
	}

}
