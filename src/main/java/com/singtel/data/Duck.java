package com.singtel.data;

public class Duck extends Bird{
	
	@Override
	public boolean sing() {
		System.out.println("Quack , quack");
		return true;
	}
	
	@Override
	public boolean swim() {
		System.out.println("I am swimming");
		return true;
	}

	public static void main(String[] args) {
		Bird duck = new Duck();
		duck.fly();
		duck.sing();
		duck.swim();
	}
	
}
