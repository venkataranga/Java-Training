package com.javatraining.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions {

	public static void main(String[] args) throws Exception{
		try{
			new Exceptions().validate("name", "password");
			System.out.println("success");
		}catch(FileNotFoundException e){
			System.out.println("file not found exception");
			throw e;
		}catch(Exception e){
			System.out.println("failed");

		}finally{
			System.out.println("from finally");
		}
		
		System.out.println("outside try & catch");
	}
	
	public void validate(String username, String password) throws Exception{
		if(username.equals("name") && password.equals("password"))
			System.out.println("valid");
		else if("".equals(username) && "".equals(password))
			throw new FileNotFoundException("Invalid username/password");
		else
			throw new Exception("Unknown exception");
	}
}
