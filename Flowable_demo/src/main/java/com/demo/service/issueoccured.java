package com.demo.service;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class issueoccured implements JavaDelegate  {

	@Override
	public void execute(DelegateExecution execution) {
		System.out.println("something went wrong");
		
	}

}
