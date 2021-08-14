package com.singtel.data;

public class ClownFish implements Fish {

	@Override
	public boolean walk() {
		System.out.println("I can't walk");
		return false;
	}

	@Override
	public boolean sing() {
		System.out.println("I can't sing");
		return false;
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

	@Override
	public void size() {
		System.out.println("I'm small");

	}

	@Override
	public void color() {
		System.out.println("I'm colour orange");

	}

	@Override
	public boolean makeJokes() {
		System.out.println("I make jokes!");
		return true;
	}

	@Override
	public boolean eat() {
		System.out.println("I eat dont fish!");
		return false;
	}

}
