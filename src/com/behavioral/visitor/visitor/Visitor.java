package com.behavioral.visitor.visitor;

import com.behavioral.visitor.visitable.Book;
import com.behavioral.visitor.visitable.CD;
import com.behavioral.visitor.visitable.DVD;

public interface Visitor {
	public void visit(Book book);
    public void visit(CD cd);
    public void visit(DVD dvd);

    public double getTotalPostage();
}
