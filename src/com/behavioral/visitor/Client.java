package com.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

import com.behavioral.visitor.visitable.Book;
import com.behavioral.visitor.visitable.CD;
import com.behavioral.visitor.visitable.DVD;
import com.behavioral.visitor.visitable.Visitable;
import com.behavioral.visitor.visitor.SouthAmericaPostageVisitor;
import com.behavioral.visitor.visitor.USPostageVisitor;
import com.behavioral.visitor.visitor.Visitor;

public class Client {

	public static double calculatePostage(Visitor visitor, List<Visitable> items) {
		for (Visitable item : items) {
			item.accept(visitor);
		}
		return visitor.getTotalPostage();
	}

	public static void main(String[] args) {
		List<Visitable> items;

		Visitable myBook = new Book(8.52, 1.05);
		Visitable myCD = new CD(18.52, 3.05);
		Visitable myDVD = new DVD(6.53, 4.02);

		items = Arrays.asList(myBook, myCD, myDVD);

		Visitor visitor = new USPostageVisitor();
		double myPostage = calculatePostage(visitor, items);
		System.out.println("The total postage for my items shipped to the US is: " + myPostage);

		visitor = new SouthAmericaPostageVisitor();
		myPostage = calculatePostage(visitor, items);
		System.out.println("The total postage for my items shipped to South America is: " + myPostage);
	}

}
