package com.singtel.data;

public class Cat implements Animal {

	@Override
	public boolean walk() {
		System.out.println("I am walking");
		return true;
	}

	@Override
	public boolean sing() {
		System.out.println("Meow, Meow");
		return true;
	}

	@Override
	public boolean fly() {
		System.out.println("I can't fly");
		return false;
	}

	@Override
	public boolean swim() {
		System.out.println("I'm swimming");
		return true;
	}

}
