package com.amitdusane.adapter;

public class Samsung implements Chargeable2 {
	
	String mobileName;
	
	public Samsung(String mobileName) {
		this.mobileName = mobileName;
	}

	public void setMobileName(String name) {
		mobileName = name;

	}

	public void performCharging() {
		System.out.println("Charging " +  mobileName + " ...");

	}

}
