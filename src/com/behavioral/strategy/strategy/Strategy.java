package com.behavioral.strategy.strategy;

import java.util.ArrayList;
import java.util.List;

import com.behavioral.strategy.rule.Rules;

public abstract class Strategy {
	protected List<Rules> rules;
	protected ExecutionStrategy executeStrategy;

	abstract Strategy build();

	public Strategy() {
		this.rules = new ArrayList<>();
		this.executeStrategy = ExecutionStrategy.SEQUENTIAL;
	}

	protected void executeStrategy() {

	}

	private void sequentialSequential() {

	}

	private void sequentialParallel() {

	}

	private void parallelSequential() {

	}

	private void parallelParallel() {

	}

}
