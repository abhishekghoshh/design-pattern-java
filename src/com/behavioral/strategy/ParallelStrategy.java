package com.behavioral.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStrategy extends Strategy {

	@Override
	public Strategy build() {
		List<ParallelSquentialRule> parallelSquentialRules = new ArrayList<>();
		
		ParallelSquentialRule parallelSquentialRule1 = new ParallelSquentialRule();
		parallelSquentialRule1.setRules(Arrays.asList(new Rule1(),new Rule2()));
		parallelSquentialRule1.setExecuteStrategy(ExecutionStrategy.PARALLEL);
		parallelSquentialRules.add(parallelSquentialRule1);
		
		ParallelSquentialRule parallelSquentialRule2 = new ParallelSquentialRule();
		parallelSquentialRule2.setRules(Arrays.asList(new Rule3(),new Rule4()));
		parallelSquentialRule2.setExecuteStrategy(ExecutionStrategy.PARALLEL);
		parallelSquentialRules.add(parallelSquentialRule2);
		
		ParallelSquentialRule parallelSquentialRule3 = new ParallelSquentialRule();
		parallelSquentialRule3.setRules(Arrays.asList(new Rule5(),new Rule6()));
		parallelSquentialRule3.setExecuteStrategy(ExecutionStrategy.PARALLEL);
		parallelSquentialRules.add(parallelSquentialRule3);
		
		ParallelSquentialRule parallelSquentialRule4 = new ParallelSquentialRule();
		parallelSquentialRule4.setRules(Arrays.asList(new Rule7(),new Rule8()));
		parallelSquentialRule4.setExecuteStrategy(ExecutionStrategy.PARALLEL);
		parallelSquentialRules.add(parallelSquentialRule4);
		
		super.setRules(parallelSquentialRules);
		super.setExecutionStrategy(ExecutionStrategy.PARALLEL);
		
		return this;
	}

}
