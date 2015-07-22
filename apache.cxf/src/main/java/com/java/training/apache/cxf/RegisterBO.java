package com.java.training.apache.cxf;

import com.java.training.apache.cxf.pojo.DB;
import com.java.training.apache.cxf.pojo.User;
import com.java.training.apache.cxf.reqres.Result;

public class RegisterBO {
	
	public Result register(User user) {
		Result r = new Result();
		if(DB.userDb.containsKey(user.getUsername())){
			r.setResponseCode("0002");
			r.setResponseMessage("Username not available");
			return r;
		}
		
		DB.userDb.put(user.getUsername(), user);
		
		r.setResponseCode("0000");
		r.setResponseMessage("SUCCESS");
		return r;

	}

}
