package com.behavioral.strategy;

import com.behavioral.strategy.model.DomainModel;
import com.behavioral.strategy.strategy.StrategyBuilder;

public class Client {

	public static void main(String[] args) {
		DomainModel domainModel1 = new DomainModel() {
			@Override
			public String getPartnerId() {
				return "01";
			}
		};
		StrategyBuilder.getStrategy(domainModel1).build().executeStrategy(domainModel1);
		
		DomainModel domainModel2 = new DomainModel() {
			@Override
			public String getPartnerId() {
				return "02";
			}
		};
		StrategyBuilder.getStrategy(domainModel2).build().executeStrategy(domainModel2);
	}

}
