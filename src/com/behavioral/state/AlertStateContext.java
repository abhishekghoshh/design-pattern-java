package com.behavioral.state;

import com.behavioral.state.state.Ringing;
import com.behavioral.state.state.State;

public class AlertStateContext {
	private State currentState;

	public AlertStateContext() {
		currentState = new Ringing(); 
	}

	public void setState(State state) {
		currentState = state;
	}

	public void alert() {
		currentState.alert();
	}
}
