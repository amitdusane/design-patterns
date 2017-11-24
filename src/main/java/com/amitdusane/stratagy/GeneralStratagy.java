package com.amitdusane.stratagy;

public abstract class GeneralStratagy implements Stratagy {

	public void execute() {
		dothis();
		dothat();
		dosomething();

	}
	
	public abstract void dothis();
	public abstract void dothat();
	public abstract void dosomething();

}
