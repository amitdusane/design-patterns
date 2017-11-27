package com.amitdusane.adapter;

public class Apple implements Chargeable1 {

	String mobileName;
	
	public Apple(String mobileName) {
		this.mobileName = mobileName;
	}

	public void setMobileName(String name) {
		mobileName = name;

	}

	public void doCharge() {
		System.out.println("Charging " + mobileName + " ....");
	}

}
