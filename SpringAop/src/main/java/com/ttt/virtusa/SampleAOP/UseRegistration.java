package com.ttt.virtusa.SampleAOP;

import org.springframework.stereotype.Component;

@Component 
public class UseRegistration implements useInterface {
 public void doRegisterUser(String newUser)
	{
		System.out.println("hi "+newUser);
	}
	public void getUserDetails(int userid)
	{
		System.out.println(" id"+userid);
	}
}
