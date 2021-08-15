package com.singtel.data;

public class Dolphin implements Animal {

	Fish fish;

	public Dolphin(Fish fish) {
		this.fish = fish;
	}

	public Dolphin() {
	}

	@Override
	public boolean walk() {
		if (null == fish) {
			System.out.println("I can't walk");
			return false;
		}
		return fish.walk();
	}

	@Override
	public boolean sing() {
		if (null == fish) {
			System.out.println("I'm singing");
			return true;
		}
		return fish.sing();
	}

	@Override
	public boolean fly() {
		if(null == fish) {
			System.out.println("I can't fly");
			return false;
		}
		return fish.fly();
	}

	@Override
	public boolean swim() {
		if (null == fish) {
			System.out.println("I'm swimming");
			return true;
		}
		return fish.swim();
	}

}
