package com.java.training.apache.cxf.reqres;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RegistationRes implements Serializable {

	Result result;

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	
	
	
}
