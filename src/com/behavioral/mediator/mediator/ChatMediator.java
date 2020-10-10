package com.behavioral.mediator.mediator;

import java.util.ArrayList;
import java.util.List;

import com.behavioral.mediator.participant.Participant;

public class ChatMediator implements Mediator {
	private List<Participant> participants = new ArrayList<>();

	@Override
	public void sendMessage(String message, Participant participant) {
		for (Participant participant_ : this.participants) {
			if (participant_ != participant) {
				participant_.receive(message);
			}
		}
	}

	@Override
	public void addUser(Participant participant) {
		this.participants.add(participant);
	}

}
