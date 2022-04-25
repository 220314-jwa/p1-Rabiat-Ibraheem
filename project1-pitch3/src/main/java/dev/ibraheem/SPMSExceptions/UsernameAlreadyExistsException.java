package dev.ibraheem.SPMSExceptions;

public class UsernameAlreadyExistsException extends Exception {
	public UsernameAlreadyExistsException () {
		super("The requested username is taken. Please enter a different username.");
	}
}
