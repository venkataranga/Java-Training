package com.spring.ioc.pojo;

public class ClassB {


	String commonPropertyA;
	String commonPropertyB;
	String commonPropertyC;
	public String getCommonPropertyA() {
		return commonPropertyA;
	}
	public void setCommonPropertyA(String commonPropertyA) {
		this.commonPropertyA = commonPropertyA;
	}
	public String getCommonPropertyB() {
		return commonPropertyB;
	}
	public void setCommonPropertyB(String commonPropertyB) {
		this.commonPropertyB = commonPropertyB;
	}
	public String getCommonPropertyC() {
		return commonPropertyC;
	}
	public void setCommonPropertyC(String commonPropertyC) {
		this.commonPropertyC = commonPropertyC;
	}
	@Override
	public String toString() {
		return "ClassB [commonPropertyA=" + commonPropertyA
				+ ", commonPropertyB=" + commonPropertyB + ", commonPropertyC="
				+ commonPropertyC + "]";
	}
	
	
}
