package com.amitdusane.stratagy;

public abstract class StandardStratagy implements Stratagy {

	public void execute() {
		doOne();
		doTwo();

	}

	public abstract void doOne();
	public abstract void doTwo();
}
