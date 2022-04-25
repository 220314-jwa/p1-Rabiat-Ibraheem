package dev.ibraheem.SPMSExceptions;

public class StoryPitchNotFoundException extends Exception {
	public StoryPitchNotFoundException () {
		super("Story pitch not found. Consider submitting a new story pitch.");
	}
}
