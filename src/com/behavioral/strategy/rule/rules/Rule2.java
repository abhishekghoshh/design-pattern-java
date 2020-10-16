package com.behavioral.strategy.rule.rules;

import com.behavioral.strategy.model.DomainModel;
import com.behavioral.strategy.rule.Rule;

public class Rule2 implements Rule{

	@Override
	public void process(DomainModel domainModel) {
		synchronizedProcess(domainModel);
	}

	private synchronized void synchronizedProcess(DomainModel domainModel) {
		synchronized(this) {
			domainModel.setName(this.getClass().getCanonicalName());
			domainModel.print();
		}
	}
}
