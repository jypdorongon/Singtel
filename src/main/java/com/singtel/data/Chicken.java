package com.singtel.data;

public class Chicken extends Bird{
	
	@Override
	public boolean sing() {
		System.out.println("Cluck, cluck");
		return true;
	}
	
	@Override
	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
	}
	
	public static void main(String[] args) {
		Bird chicken = new Chicken();
		chicken.swim();
		chicken.sing();
		chicken.fly();
		chicken.walk();
	}

}
