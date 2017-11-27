package com.amitdusane.adapter;

public class SampsungAdapter implements Chargeable1 {

	private Chargeable2 samsung;	
	
	public SampsungAdapter(Chargeable2 samsung) {
		this.samsung = samsung;
	}
	
	public void setMobileName(String name) {
		//Do nothing.

	}

	public void doCharge() {
		samsung.performCharging();
	}

}
