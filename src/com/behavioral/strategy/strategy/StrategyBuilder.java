package com.behavioral.strategy.strategy;

import com.behavioral.strategy.model.Partner;
import com.behavioral.strategy.strategy.strategies.SequentialStrategy;

public class StrategyBuilder {

	public static Strategy getStrategy(Partner partner) {
		switch (partner.getPartnerId()) {
		case "01":
			return new SequentialStrategy();
		case "02":
			return new ParallelStrategy();
		case "03":
			return null;
		case "04":
			return null;
		default:
			throw new RuntimeException("unknown partner id");
		}
	}
}
