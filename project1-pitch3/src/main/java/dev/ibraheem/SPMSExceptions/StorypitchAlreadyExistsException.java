package dev.ibraheem.SPMSExceptions;

public class StorypitchAlreadyExistsException extends Exception	{
	public StorypitchAlreadyExistsException () {
		super("This story pitch already exists. Please choose another title.");
	}
}
