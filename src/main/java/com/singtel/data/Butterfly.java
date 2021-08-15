package com.singtel.data;

public class Butterfly implements Animal{
	
	boolean isCaterpillar;
	
	public Butterfly(boolean isCaterpillar) {
		this.isCaterpillar = isCaterpillar;
	}
	
	
	public Butterfly() {
		
	}

	@Override
	public boolean walk() {
		if(isCaterpillar) {
			System.out.println("I'm crawling");
			return true;
		}else {
			System.out.println("I can't crawl");
			return false;
		}
	}

	@Override
	public boolean sing() {
		System.out.println("I can't sing");
		return false;
	}

	@Override
	public boolean fly() {
		if(isCaterpillar) {
			System.out.println("I can't fly");
			return false;
		}else {
			System.out.println("I'm flying");
			return true;
		}
	}

	@Override
	public boolean swim() {
		System.out.println("I can't swim");
		return false;
	}

}
