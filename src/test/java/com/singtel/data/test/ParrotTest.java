package com.singtel.data.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.data.Cat;
import com.singtel.data.Dog;
import com.singtel.data.Duck;
import com.singtel.data.Parrot;

public class ParrotTest {
	
	Parrot parrot;
	Parrot parrotLivingWithDog;
	Parrot parrotLivingWithCat;
	Parrot parrotLivingWithDuck;
	
	@Before
	public void setUp() {
		parrot = new Parrot();
		
		parrotLivingWithDog = new Parrot();
		parrotLivingWithDog.isLivingWith(new Dog());
		
		parrotLivingWithCat = new Parrot();
		parrotLivingWithCat.isLivingWith(new Cat());
		
		parrotLivingWithDuck = new Parrot();
		parrotLivingWithDuck.isLivingWith(new Duck());
		
	}
	
	@Test
	public void parrotLivingAlone() {
		System.out.println("----Ordinary Parrot Test----");
		assertTrue(parrot.sing());
		assertTrue(parrot.walk());
		assertTrue(parrot.fly());
		assertFalse(parrot.swim());
	}
	
	
	@Test
	public void parrotLivingWithDog() {
		System.out.println("----Parrot Living with Dog Test----");;
		assertTrue(parrotLivingWithDog.sing());
		assertTrue(parrotLivingWithDog.walk());
		assertTrue(parrotLivingWithDog.fly());
		assertFalse(parrotLivingWithDog.swim());
	}
	

	@Test
	public void parrotLivingWithDuck() {
		System.out.println("----Parrot Living with Duck Test----");;
		assertTrue(parrotLivingWithDuck.sing());
		assertTrue(parrotLivingWithDuck.walk());
		assertTrue(parrotLivingWithDuck.fly());
		assertFalse(parrotLivingWithDuck.swim());
	}
	

}
