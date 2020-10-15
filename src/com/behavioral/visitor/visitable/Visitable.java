package com.behavioral.visitor.visitable;

import com.behavioral.visitor.visitor.Visitor;

public interface Visitable {
	public void accept(Visitor visitor);
}
