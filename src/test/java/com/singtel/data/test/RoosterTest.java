package com.singtel.data.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.singtel.data.Chicken;
import com.singtel.data.Rooster;

public class RoosterTest {

	Chicken rooster;
	Rooster roos;

	@Before
	public void setUp() {
		rooster = new Rooster();
		roos = new Rooster();
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

	@Test
	public void displayRoosterLang() {
		List<String> lang = new ArrayList<String>();

		lang.add("Danish");
		lang.add("Dutch");
		lang.add("Finnish");
		lang.add("French");
		lang.add("German");
		lang.add("Greek");
		lang.add("Hebrew");
		lang.add("Hungarian");
		lang.add("Italian");
		lang.add("Japanese");
		lang.add("Portuguese");
		lang.add("Russian");
		lang.add("Swedish");
		lang.add("Turkish");
		lang.add("Urdu");
		lang.add("Filipino");

		for (String language : lang) {
			roos.sing(language);
		}

	}

}
