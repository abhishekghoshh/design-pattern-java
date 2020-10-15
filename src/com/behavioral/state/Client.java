package com.behavioral.state;

import com.behavioral.state.state.Silent;

public class Client {

	public static void main(String[] args) {
		AlertStateContext stateContext = new AlertStateContext();

		stateContext.alert();
		stateContext.alert();

		stateContext.setState(new Silent());

		stateContext.alert();
		stateContext.alert();
		stateContext.alert();
	}

}
