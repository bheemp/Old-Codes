package com.bheem.service;
import org.springframework.stereotype.Service;

@Service
public class GreetingMessageServiceImp implements GreetingMesagrService {

	public String greetUser() {
		return "Welcome to Chapter-1 of book Learning Spring Application Development";
	}

}
