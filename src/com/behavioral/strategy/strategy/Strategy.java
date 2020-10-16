package com.behavioral.strategy.strategy;

import java.util.Collections;
import java.util.List;

import com.behavioral.strategy.model.DomainModel;
import com.behavioral.strategy.rule.ParallelSquentialRule;

public abstract class Strategy {
	private List<ParallelSquentialRule> parallelSquentialRules;
	private ExecutionStrategy executionStrategy;
	public abstract Strategy build();

	public Strategy() {
		this.executionStrategy = ExecutionStrategy.SEQUENTIAL;
	}
	protected Strategy setRules(List<ParallelSquentialRule> parallelSquentialRules) {
		this.parallelSquentialRules = Collections.synchronizedList(parallelSquentialRules);
		return this;
	}

	protected Strategy setExecutionStrategy(ExecutionStrategy executionStrategy) {
		this.executionStrategy = executionStrategy;
		return this;
	}

	public void executeStrategy(DomainModel domainModel) {
		if (null != parallelSquentialRules && parallelSquentialRules.size() > 0) {
			if (executionStrategy == ExecutionStrategy.SEQUENTIAL) {
				parallelSquentialRules.stream().forEach(rules -> execute(rules, domainModel));
			} else {
				parallelSquentialRules.parallelStream().forEach(rules -> execute(rules, domainModel));
			}
		}
	}

	private void execute(ParallelSquentialRule rules, DomainModel domainModel) {
		if (null != rules && null != rules.getRules() && rules.getRules().size() > 0) {
			if (rules.getExecuteStrategy() == ExecutionStrategy.SEQUENTIAL) {
				rules.getRules().stream().forEach(rule -> rule.process(domainModel));
			} else {
				rules.getRules().stream().forEach(rule -> rule.process(domainModel));
			}
		}
	}
}
