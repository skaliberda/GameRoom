package com.epam.cdp.byta2014.module4.lecture2.demo.exception;

public class PerformanceException extends Exception {

    private String msg;

    public PerformanceException(String msg) {
        this.msg = msg;
	}
	
	public String getMessage() {
        return "[PerformanceException]: Linked list is slower than ArrayList while searching for specific elements in an array'" + msg + "'!";
    }

}
