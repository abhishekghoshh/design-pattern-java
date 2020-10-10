package com.behavioral.iterator.collection;

import java.util.Arrays;

import com.behavioral.iterator.iterator.Iterator;
import com.behavioral.iterator.iterator.ListIterator;


public class ArrayList<T> implements List<T> {

	private int capacity = 20;
	private T[] list;
	private int index=0;
	
	@SuppressWarnings("unchecked")
	public ArrayList() {
		list=(T[]) new Object[capacity];
	}
	
	@Override
	public Iterator<T> getIterator() {
		return new ListIterator<>(this);
	}

	@Override
	public void add(T object) {
		if(this.index<this.capacity) {
			list[index++] = object;
		}
	}

	@Override
	public T get(int index) {
		return list[index];
	}

	@Override
	public void add(List<T> list) {
		for(int i=0;i<list.size();i++) {
			if(this.index<this.capacity) {
				this.list[this.index++] = list.get(i); 
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		list= (T[]) new Object[capacity];
	}

	@Override
	public int size() {
		return index;
	}

	@Override
	public String toString() {
		return "ArrayList "+ Arrays.toString(list);
	}
	

}
