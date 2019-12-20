package com.mindtree.tickettrackingsystem.exception.service;

import com.mindtree.tickettrackingsystem.exception.AppException;

public class TicketTrackingSystemServiceException extends AppException{

	public TicketTrackingSystemServiceException() {
		
	}
	public TicketTrackingSystemServiceException(String arg0,Throwable arg1)
	{
		super(arg0,arg1);
	}
	public TicketTrackingSystemServiceException(String arg0)
	{
		super(arg0);
	}
	public TicketTrackingSystemServiceException(Throwable arg1)
	{
		super(arg1);
	}
}
