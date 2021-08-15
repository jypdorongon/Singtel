package com.singtel.data.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.data.Animal;
import com.singtel.data.Bird;
import com.singtel.data.Butterfly;
import com.singtel.data.Cat;
import com.singtel.data.Chicken;
import com.singtel.data.ClownFish;
import com.singtel.data.Dog;
import com.singtel.data.Dolphin;
import com.singtel.data.Duck;
import com.singtel.data.Fish;
import com.singtel.data.Parrot;
import com.singtel.data.Rooster;
import com.singtel.data.Shark;

public class AnimalTest {

	Animal[] animals;

	@Before
	public void setUp() {
		animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(), new Shark(),
				new ClownFish(), new Dolphin(), new Dog(), new Butterfly(), new Butterfly(true), new Cat() };
	}

	@Test
	public void countAnimal() {
		int canWalk = 0;
		int canSing = 0;
		int canFly = 0;
		int canSwim = 0;
		
		for (Animal animal : animals) {
			System.out.println("---" + animal.getClass().getName() + "---");

			if (animal.fly()) {
				canFly++;
			}

			if (animal.walk()) {
				canWalk++;
			}

			if (animal.sing()) {
				canSing++;
			}

			if (animal.swim()) {
				canSwim++;
			}

		}
		System.out.println("----------------------------------------");
		System.out.println("Number of animals that can fly " + canFly);
		System.out.println("Number of animals that can walk " + canWalk);
		System.out.println("Number of animals that can sing " + canSing);
		System.out.println("Number of animals that can swim " + canSwim);
		
		assertTrue(canFly > 0);
		assertTrue(canWalk > 0);
		assertTrue(canSing > 0);
		assertTrue(canSwim > 0);
	}

}
