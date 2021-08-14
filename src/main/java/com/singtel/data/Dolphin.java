package com.singtel.data;

public class Dolphin implements Animal {

	Fish fish;

	public Dolphin(Fish fish) {
		this.fish = fish;
	}

	@Override
	public boolean walk() {
		return fish.walk();
	}

	@Override
	public boolean sing() {
		return fish.sing();
	}

	@Override
	public boolean fly() {
		return fish.fly();
	}

	@Override
	public boolean swim() {
		return fish.swim();
	}

}
