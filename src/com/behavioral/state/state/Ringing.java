package com.behavioral.state.state;

public class Ringing implements State {

	@Override
	public void alert() {
		System.out.println("ringing...");
	}

}
