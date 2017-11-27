package com.amitdusane.adapter;

//url - https://www.youtube.com/watch?v=NiGImjVfAms
public class Demo {

	public static void main(String[] args) {
		
		Chargeable1 charger = new Apple("Iphone 6");
		ChargerUtils.charge(charger );
		
		Chargeable2 charger2 = new Samsung("Galaxy 4");
		//ChargerUtils.charge(charger2 ); this is not possible so introduced adapter
		Chargeable1 adapterCharger = new SampsungAdapter(charger2);
		ChargerUtils.charge(adapterCharger ); // now this possible

	}

}
