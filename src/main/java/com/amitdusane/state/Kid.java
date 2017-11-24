package com.amitdusane.state;

public class Kid {
	int age;
	private KidState kidState = null;
	

	public Kid(int age) {
		setAge(age);		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		if(age == 1 ) setKidState(new FirstYearKid());
		if(age == 2 ) setKidState(new SecondYearKid());
		if(age == 3 ) setKidState(new ThirdYearKid());
		if(age > 3 ) setKidState(new AnyYearKid());
	}

	public KidState getKidState() {
		return kidState;
	}

	public void setKidState(KidState kidState) {
		this.kidState = kidState;
	}
}
