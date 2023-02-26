package com.behavioral.observer;

public class Client {
	public static void main(String[] args) {
		Topic topic = new Topic();

		Observer obj1 = new TopicSubscriber("Obj1");
		Observer obj2 = new TopicSubscriber("Obj2");
		Observer obj3 = new TopicSubscriber("Obj3");

		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);

		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);

		obj1.update();

		topic.postMessage("New Message");
	}
}
