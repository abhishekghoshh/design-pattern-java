package com.behavioral.strategy.rule;

import com.behavioral.strategy.model.DomainModel;

public interface Rule {
	void process(DomainModel domainModel);
}
