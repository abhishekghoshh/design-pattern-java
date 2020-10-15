package com.behavioral.observer.observer;

import com.behavioral.observer.subject.Subject;

public interface Observer {
	public void update();

	public void setSubject(Subject sub);
}
