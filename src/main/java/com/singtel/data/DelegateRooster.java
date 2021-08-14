package com.singtel.data;

public class DelegateRooster {
	
	Chicken chicken = new Chicken();
	
	public boolean fly() {
		return chicken.fly();
	}
	
	public boolean sing() {
		System.out.println("Cock-a-doodle-doo");
		return true;
	}
	
	public boolean walk() {
		return chicken.walk();
	}

}
