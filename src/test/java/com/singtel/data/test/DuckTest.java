package com.singtel.data.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.data.Bird;
import com.singtel.data.Duck;

public class DuckTest {
	

	
	Bird duck;
	
	@Before
	public void setUp() {
		duck = new Duck();
	}
	
	@Test
	public void testWalk() {
		assertTrue(duck.walk());
	}
	
	@Test
	public void testFly() {
		assertTrue(duck.fly());
	}
	
	@Test
	public void testSing() {
		assertTrue(duck.sing());
	}
	
	@Test
	public void testSwim() {
		assertTrue(duck.swim());
	}
	

}
