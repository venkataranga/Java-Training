
package com.java.training.apache.cxf;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.java.training.apache.cxf.pojo.DB;
import com.java.training.apache.cxf.reqres.RegistationRes;
import com.java.training.apache.cxf.reqres.RegistrationReq;
import com.java.training.apache.cxf.reqres.Result;

@WebService(endpointInterface = "com.java.training.apache.cxf.RegistrationService")
public class RegistrationServiceImpl implements RegistrationService {
	public RegisterBO getBo() {
		return bo;
	}

	public void setBo(RegisterBO bo) {
		this.bo = bo;
	}

	RegisterBO bo;
	@Override
	@WebMethod(action="register")
	public RegistationRes register(RegistrationReq rq) {
		RegistationRes rs = new RegistationRes();
		Result r = new Result();
		if(rq.getUser().getFirstname()==null || "".equals(rq.getUser().getFirstname())
				|| rq.getUser().getLastname()==null || "".equals(rq.getUser().getLastname())
				|| rq.getUser().getUsername()==null || "".equals(rq.getUser().getUsername())
				|| rq.getUser().getPassword()==null || "".equals(rq.getUser().getPassword())){
			
			r.setResponseCode("0001");
			r.setResponseMessage("Invalid Request");
			rs.setResult(r);
			return rs;
			
		}
		
		r = bo.register(rq.getUser());
		rs.setResult(r);
		return rs;
		
	}

	@Override
	@WebMethod(action="delete")
	public RegistationRes delete(RegistrationReq rq) {
		RegistationRes rs = new RegistationRes();
		Result r = new Result();
		if(!DB.userDb.containsKey(rq.getUser().getUsername())){
			
			r.setResponseCode("0002");
			r.setResponseMessage("Username not available");
			
			rs.setResult(r);
			return rs;
		}
		DB.userDb.remove(rq.getUser().getUsername());
		
		r.setResponseCode("0000");
		r.setResponseMessage("SUCCESS");
		
		rs.setResult(r);
		return rs;
	}
}

