package com.behavioral.chainOfResponsible.raiser;

import com.behavioral.chainOfResponsible.message.Message;
import com.behavioral.chainOfResponsible.reciever.Receiver;

public class IssueRaiser implements Raiser{
	public Receiver receiver;

	public IssueRaiser(Receiver firstReceiver) {
		this.receiver = firstReceiver;
	}
	@Override
	public void raiseMessage(Message message) {
		if (receiver != null)
			receiver.processMessage(message);
	}
}
