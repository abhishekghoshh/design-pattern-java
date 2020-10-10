package com.behavioral.iterator.collection;

public interface List<T> extends Collection<T> {
	void add(T object);
	T get(int index);
	void add(List<T> list);
	void clear();
	int size();
}
