package com.behavioral.iterator.collection;

import com.behavioral.iterator.iterator.Iterator;

public interface Collection<T> {
	public Iterator<T> getIterator();
}
