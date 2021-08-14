package com.singtel.data;

public class Bird implements Animal {

	@Override
	public boolean fly() {
		System.out.println("I am flying");
		return true;
	}
	
	@Override
	public boolean sing() {
		System.out.println("I am singing");
		return true;
	}

	@Override
	public boolean walk() {
		System.out.println("I am walking");
		return true;
	}
	
	
	@Override
	public boolean swim() {
		System.out.println("I can't swim");
		return false;
	}

}
