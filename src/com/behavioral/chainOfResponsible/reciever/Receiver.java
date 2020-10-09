package com.behavioral.chainOfResponsible.reciever;

import com.behavioral.chainOfResponsible.message.Message;

public interface Receiver {
	boolean processMessage(Message msg);
	void setNextChain(Receiver nextChain);
}

