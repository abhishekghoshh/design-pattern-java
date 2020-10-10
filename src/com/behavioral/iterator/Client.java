package com.behavioral.iterator;

import com.behavioral.iterator.collection.ArrayList;
import com.behavioral.iterator.collection.List;
import com.behavioral.iterator.iterator.Iterator;

public class Client {

	public static void main(String[] args) {
		List<String> listAbhi = new ArrayList<>();
		listAbhi.add("Abhishek");
		listAbhi.add("Ghosh");
		System.out.println(listAbhi);
		
		List<String> listBud = new ArrayList<>();
		listBud.add("Budhdhadev");
		listBud.add("Ghosh");
		System.out.println(listBud);
		
		listAbhi.add(listBud);
		System.out.println(listAbhi);
		
		Iterator<String> iterator = listAbhi.getIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());	
		}
	}

}
