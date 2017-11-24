package com.amitdusane.state;
//Same object changes its behaviour(method output) depends on input
public class Demo {

	public static void main(String[] args) {
		Kid kid = new Kid(2);
		kid.getKidState().eat();
		kid.setAge(5); // Same object changes its behaviour(method output)
						// depends on input
		kid.getKidState().eat();
	}

}
