package com.epam.cdp.byta2014.module4.lecture2.demo.exception;

public class FindByNameException extends Exception{
	
	private String msg;
	
	public FindByNameException(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return "[FindBuNameException]: There are not records with name='" + msg + "'!";
	}

}
