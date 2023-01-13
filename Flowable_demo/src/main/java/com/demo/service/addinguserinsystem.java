//package com.demo.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.flowable.engine.delegate.DelegateExecution;
//import org.flowable.engine.delegate.JavaDelegate;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.demo.model.Users;
//import com.demo.repos.myrepo1;
//
//public class addinguserinsystem implements JavaDelegate {
//
//	@Autowired
//	myrepo1 repo1;
//	
//	@Override
//	public void execute(DelegateExecution execution) {
//		Object name =  execution.getVariable("name");
//		Object email =  execution.getVariable("email");
//		Object age =  execution.getVariable("age");
//		boolean b = true;
//		if((int)age <18) {
//			b=false;
//		}
//		execution.setVariable("added", b);
//		
//	}
//
//}
