package com.behavioral.strategy.rule;

import java.util.ArrayList;
import java.util.List;

import com.behavioral.strategy.strategy.ExecutionStrategy;

public class ParallelSquentialRule {
	
	private List<Rule> rules;
	private ExecutionStrategy executeStrategy;
	
	public ParallelSquentialRule(List<Rule> rules, ExecutionStrategy executeStrategy) {
		this.rules = rules;
		this.executeStrategy = executeStrategy;
	}
	public ParallelSquentialRule() {
		rules=new ArrayList<>();
		executeStrategy = ExecutionStrategy.SEQUENTIAL;
	}
	public List<Rule> getRules() {
		return rules;
	}
	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}
	public ExecutionStrategy getExecuteStrategy() {
		return executeStrategy;
	}
	public void setExecuteStrategy(ExecutionStrategy executeStrategy) {
		this.executeStrategy = executeStrategy;
	}
	
	

}
