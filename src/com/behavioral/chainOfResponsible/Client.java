package com.behavioral.chainOfResponsible;

import com.behavioral.chainOfResponsible.message.Message;
import com.behavioral.chainOfResponsible.message.Priority;
import com.behavioral.chainOfResponsible.raiser.IssueRaiser;
import com.behavioral.chainOfResponsible.raiser.Raiser;
import com.behavioral.chainOfResponsible.reciever.EmailReceiver;
import com.behavioral.chainOfResponsible.reciever.FaxReceiver;
import com.behavioral.chainOfResponsible.reciever.Receiver;

public class Client {
	public static void main(String[] args) {

		Receiver faxHandler, emailHandler;
		emailHandler = new EmailReceiver();
		faxHandler = new FaxReceiver();
		faxHandler.setNextChain(emailHandler);
		Raiser raiser = new IssueRaiser(faxHandler);

		Message m1 = new Message("Fax is reaching late to the destination", Priority.Normal);
		Message m2 = new Message("Email is not going", Priority.High);
		Message m3 = new Message("In Email, BCC field is disabled occasionally", Priority.Normal);
		Message m4 = new Message("Fax is not reaching destination", Priority.High);

		raiser.raiseMessage(m1);
		raiser.raiseMessage(m2);
		raiser.raiseMessage(m3);
		raiser.raiseMessage(m4);

	}
}
