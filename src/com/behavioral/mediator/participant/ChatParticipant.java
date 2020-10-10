package com.behavioral.mediator.participant;

import java.util.Date;

import com.behavioral.mediator.mediator.Mediator;

public class ChatParticipant extends Participant {

	public ChatParticipant(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		System.out.println(dateFormat.format(new Date()).toString()+" : "+this.name + " : Sending Message : " + message);
		mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(dateFormat.format(new Date()).toString()+" : "+this.name + " : Received Message : " + message);
	}

}
