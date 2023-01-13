package com.demo.service;

import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.User;

import org.flowable.dmn.api.DmnDecisionService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
@Service
public class service1 {
	
	@Autowired
	private RuntimeService runtimeService;
	
	@Autowired
	private TaskService taskservice;
	
	
	
	String processid = "";
	
	public void startProcess() {
//		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("eventregistration");
		ProcessInstance processInstance = runtimeService.startProcessInstanceByMessage("newInvoiceMessage");
		processid = processInstance.getId();
		System.out.println("process id is " +processInstance.getId());	
		decser.
	}

	public void addinguser(User user) {
		Task user_task = taskservice.createTaskQuery().processInstanceId(processid).singleResult();
		runtimeService.setVariable(user_task.getExecutionId() , "email", user.getE_mail());
		runtimeService.setVariable(user_task.getExecutionId() , "name", user.getName());
		runtimeService.setVariable(user_task.getExecutionId() , "password", user.getPassword());
		runtimeService.setVariable(user_task.getExecutionId() , "age", user.getAge());
		System.out.println("variables has been set");
		 System.out.println(user_task.getId());
		taskservice.complete(user_task.getId());
	}
	
}
