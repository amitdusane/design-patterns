package com.amitdusane.stratagy;

import java.util.Arrays;
import java.util.List;

//Depending on instance execution strategy is decided

public class Demo {

	public static void main(String[] args) {
		
		List<Stratagy> stratagies = Arrays.asList(new General(), new Standard());
		
		for (Stratagy stratagy : stratagies) {
			stratagy.execute();
		}
		
	}
}
