package com.behavioral.mediator;

import com.behavioral.mediator.mediator.ChatMediator;
import com.behavioral.mediator.mediator.Mediator;
import com.behavioral.mediator.participant.ChatParticipant;
import com.behavioral.mediator.participant.Participant;

public class Client {
	public static void main(String arg[]) {
		Mediator mediator = new ChatMediator();

		Participant user1 = new ChatParticipant(mediator, "Jason");
		Participant user2 = new ChatParticipant(mediator, "Jennifer");
		Participant user3 = new ChatParticipant(mediator, "Lucy");
		Participant user4 = new ChatParticipant(mediator, "Ian");

		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.send("Hi All");

		user2.send("It is evening now");
	}
}
