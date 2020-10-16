package com.behavioral.strategy.strategy.strategies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.behavioral.strategy.rule.ParallelSquentialRule;
import com.behavioral.strategy.rule.rules.Rule1;
import com.behavioral.strategy.rule.rules.Rule2;
import com.behavioral.strategy.rule.rules.Rule3;
import com.behavioral.strategy.rule.rules.Rule4;
import com.behavioral.strategy.rule.rules.Rule5;
import com.behavioral.strategy.rule.rules.Rule6;
import com.behavioral.strategy.rule.rules.Rule7;
import com.behavioral.strategy.rule.rules.Rule8;
import com.behavioral.strategy.strategy.ExecutionStrategy;
import com.behavioral.strategy.strategy.Strategy;

public class SequentialStrategy extends Strategy {

	@Override
	public Strategy build() {
		List<ParallelSquentialRule> parallelSquentialRules = new ArrayList<>();
		
		ParallelSquentialRule parallelSquentialRule1 = new ParallelSquentialRule();
		parallelSquentialRule1.setRules(Arrays.asList(new Rule1(),new Rule2()));
		parallelSquentialRule1.setExecuteStrategy(ExecutionStrategy.SEQUENTIAL);
		parallelSquentialRules.add(parallelSquentialRule1);
		
		ParallelSquentialRule parallelSquentialRule2 = new ParallelSquentialRule();
		parallelSquentialRule2.setRules(Arrays.asList(new Rule3(),new Rule4()));
		parallelSquentialRule2.setExecuteStrategy(ExecutionStrategy.SEQUENTIAL);
		parallelSquentialRules.add(parallelSquentialRule2);
		
		ParallelSquentialRule parallelSquentialRule3 = new ParallelSquentialRule();
		parallelSquentialRule3.setRules(Arrays.asList(new Rule5(),new Rule6()));
		parallelSquentialRule3.setExecuteStrategy(ExecutionStrategy.SEQUENTIAL);
		parallelSquentialRules.add(parallelSquentialRule3);
		
		ParallelSquentialRule parallelSquentialRule4 = new ParallelSquentialRule();
		parallelSquentialRule4.setRules(Arrays.asList(new Rule7(),new Rule8()));
		parallelSquentialRule4.setExecuteStrategy(ExecutionStrategy.SEQUENTIAL);
		parallelSquentialRules.add(parallelSquentialRule4);
		
		super.setRules(parallelSquentialRules);
		super.setExecutionStrategy(ExecutionStrategy.SEQUENTIAL);
		
		return this;
	}

}
