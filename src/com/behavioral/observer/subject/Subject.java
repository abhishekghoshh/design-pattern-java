package com.behavioral.observer.subject;

import com.behavioral.observer.observer.Observer;

public interface Subject {
	public void register(Observer obj);

	public void unregister(Observer obj);

	public void notifyObservers();

	public Object getUpdate(Observer obj);
}
