package com.singtel.data.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.data.Butterfly;

public class CaterpillarTest {

	Butterfly caterpillar;

	@Before
	public void setUp() {
		caterpillar = new Butterfly(true);
	}

	@Test
	public void testWalk() {
		assertTrue(caterpillar.walk());
	}

	@Test
	public void testFly() {
		assertFalse(caterpillar.fly());
	}

	@Test
	public void testSing() {
		assertFalse(caterpillar.sing());
	}

	@Test
	public void testSwim() {
		assertFalse(caterpillar.swim());
	}
}
