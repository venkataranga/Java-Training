package com.java.training.apache.cxf;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.java.training.apache.cxf.reqres.RegistationRes;
import com.java.training.apache.cxf.reqres.RegistrationReq;

@WebService
public interface RegistrationService {
	@WebMethod
	RegistationRes register(RegistrationReq rq);
	RegistationRes delete(RegistrationReq rq);
}

