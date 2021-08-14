package com.singtel.data.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.data.Animal;
import com.singtel.data.Bird;

public class BirdTest {
	
	Animal animal;

	@Before
	public void setUp() {
		animal = new Bird();
	}
	
	
	@Test
	public void testWalk() {
		assertTrue(animal.walk());
	}
	
	
	@Test
	public void testFly() {
		assertTrue(animal.fly());
	}
	
	@Test
	public void testSing() {
		assertTrue(animal.sing());
	}



}
