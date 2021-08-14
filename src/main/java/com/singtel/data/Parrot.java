package com.singtel.data;

public class Parrot extends Bird {

	Animal animal;

	public void isLivingWith(Animal animal) {
		this.animal = animal;
	}

	@Override
	public boolean sing() {
		if (null == animal) {
			animal = new Bird(); //typical parrot
		}

		animal.sing();
		return true;
	}

}
