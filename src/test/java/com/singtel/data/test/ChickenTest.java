package com.singtel.data.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.data.Bird;
import com.singtel.data.Chicken;

public class ChickenTest {
	

	Bird bird;
	
	@Before
	public void setUp() {
		bird = new Chicken();
	}
	
	@Test
	public void testWalk() {
		assertTrue(bird.walk());
	}
	
	@Test
	public void testFly() {
		assertFalse(bird.fly());
	}
	
	@Test
	public void testSing() {
		assertTrue(bird.sing());
	}

}
