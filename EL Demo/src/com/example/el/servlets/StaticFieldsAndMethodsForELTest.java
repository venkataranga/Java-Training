package com.example.el.servlets;
enum Days {SATURDAY};
public class StaticFieldsAndMethodsForELTest {
	
	public static String NON_FINAL_STRING = "Is this Modifiable by EL?";
	private String accessPropertiesFromEL = "this is the value of accessPropertiesFromEL variable";
	//public static 
	@Override
	public String toString() {
		return "StaticFieldsAndMethodsForELTest [accessPropertiesFromEL="
				+ accessPropertiesFromEL + "]";
	}

	public String getAccessPropertiesFromEL() {
		return accessPropertiesFromEL;
	}

	public void setAccessPropertiesFromEL(String accessPropertiesFromEL) {
		this.accessPropertiesFromEL = accessPropertiesFromEL;
	}

	public static String acceptByte(byte b){
		return "Accept byte value is: "+b;
	}
	
	public static String acceptChar(char c){
		return "Accept char value is: "+c;
	}
	
	public static String acceptShort(short s){
		return "Accept short value is: "+s;
	}
}
