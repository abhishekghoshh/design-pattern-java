package com.behavioral.strategy;

public class Rule7 implements Rule{

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
