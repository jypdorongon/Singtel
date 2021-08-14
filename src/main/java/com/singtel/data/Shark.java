package com.singtel.data;

public class Shark implements Fish {

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
		System.out.println("I'm HUGE");

	}

	@Override
	public void color() {
		System.out.println("I'm colour grey");

	}

	@Override
	public boolean makeJokes() {
		System.out.println("I don't make jokes!");
		return false;
	}

	@Override
	public boolean eat() {
		System.out.println("I eat fish!");
		return true;
	}

}
