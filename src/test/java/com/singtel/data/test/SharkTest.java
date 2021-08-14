package com.singtel.data.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.data.Fish;
import com.singtel.data.Shark;

public class SharkTest {

	Fish shark;
	
	@Before
	public void setUp() {
		shark = new Shark();
	}
	
	@Test
	public void testWalk() {
		assertFalse(shark.walk());
	}
	
	@Test
	public void testFly() {
		assertFalse(shark.fly());
	}
	
	@Test
	public void testSing() {
		assertFalse(shark.sing());
	}
	
	@Test
	public void testSwim() {
		assertTrue(shark.swim());
	}
	
	@Test
	public void displayAppearance() {
		shark.color();
		shark.size();
	}
	
	@Test
	public void testEat() {
		assertTrue(shark.eat());
	}
	
	@Test
	public void testJokes() {
		assertFalse(shark.makeJokes());
	}
}
