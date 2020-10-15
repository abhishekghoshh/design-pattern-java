package com.behavioral.state.state;

public class Vibration implements State {

	@Override
    public void alert()  {
        System.out.println("vibration...");
    }

}
