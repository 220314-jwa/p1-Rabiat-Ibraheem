package dev.ibraheem.SPMSExceptions;

public class IncorrectCredentialsException extends Exception{
	public IncorrectCredentialsException () {
		super("The user credentials are incorrect");
	}
}
