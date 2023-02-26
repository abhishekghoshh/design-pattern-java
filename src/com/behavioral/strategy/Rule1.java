package com.behavioral.strategy;

public class Rule1 implements Rule{

	@Override
	public void process(DomainModel domainModel) {
		synchronizedProcess(domainModel);
	}

	private void synchronizedProcess(DomainModel domainModel) {
		synchronized(this) {
			domainModel.setName(this.getClass().getCanonicalName());
			domainModel.print();
		}
	}
}
