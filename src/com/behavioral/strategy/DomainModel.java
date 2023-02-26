package com.behavioral.strategy;

public abstract class DomainModel implements Partner{
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println("Name is : "+name);
	}
}
