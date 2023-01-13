package com.demo.service;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class timeoutmessage implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) {
		System.out.println("Please fill the details again");
		
	}

}
