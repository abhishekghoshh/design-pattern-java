package com.behavioral.mediator.mediator;

import com.behavioral.mediator.participant.Participant;

public interface Mediator {

	void sendMessage(String message, Participant participant);
	void addUser(Participant participant);

}
