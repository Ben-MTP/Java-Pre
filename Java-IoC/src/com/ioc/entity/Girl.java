package com.ioc.entity;

public class Girl {

	private Outfit outfit;
	public Girl(Outfit anything) {
		outfit = anything;
	}
	
	public Outfit getOutfit() {
		return outfit;
	}
}
