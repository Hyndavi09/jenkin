package com.mindtree.tickettrackingsystem.exception;

public class AppException extends Exception{

	public AppException() {
		// TODO Auto-generated constructor stub
		super();
	}
	public AppException(String arg0,Throwable arg1)
	{
		super(arg0,arg1);
	}
	public AppException(String arg0)
	{
		super(arg0);
	}
	public AppException(Throwable arg1)
	{
		super(arg1);
	}

}
