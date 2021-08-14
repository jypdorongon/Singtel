package com.singtel.data.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.data.ClownFish;
import com.singtel.data.Fish;

public class ClownFishTest {

	Fish clownFish;
	
	@Before
	public void setUp() {
		clownFish = new ClownFish();
	}
	
	@Test
	public void testWalk() {
		assertFalse(clownFish.walk());
	}
	
	@Test
	public void testFly() {
		assertFalse(clownFish.fly());
	}
	
	@Test
	public void testSing() {
		assertFalse(clownFish.sing());
	}
	
	@Test
	public void testSwim() {
		assertTrue(clownFish.swim());
	}
	
	@Test
	public void displayAppearance() {
		clownFish.color();
		clownFish.size();
	}
	
	@Test
	public void testEat() {
		assertFalse(clownFish.eat());
	}
	
	@Test
	public void testJokes() {
		assertTrue(clownFish.makeJokes());
	}
}
