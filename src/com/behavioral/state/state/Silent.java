package com.behavioral.state.state;

public class Silent implements State {
	@Override
	public void alert() {
		System.out.println("silent...");
	}
}