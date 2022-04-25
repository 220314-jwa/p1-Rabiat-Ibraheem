package dev.ibraheem.SPMSServices;
//User login services
//might be renamed to editor services down the line

import java.sql.SQLException;
import java.util.List;

import dev.ibraheem.SPMSExceptions.IncorrectCredentialsException;
import dev.ibraheem.SPMSExceptions.StorypitchAlreadyExistsException;
import dev.ibraheem.SPMSExceptions.UserNotFound;
import dev.ibraheem.SPMSExceptions.UsernameAlreadyExistsException;
import dev.ibraheem.project1.PitchTable;
import dev.ibraheem.project1.UserInfo;

public interface UserServices {
	
	public UserInfo logIn(String username, String password) throws IncorrectCredentialsException;
	public PitchTable createNewPitch(String tentative_title) throws StorypitchAlreadyExistsException;
	public UserInfo register(UserInfo newUser) throws UsernameAlreadyExistsException;
	public PitchTable checkByStatus(int author_id);
	public List<PitchTable> viewByStatus();
	//PitchTable newPitch(PitchTable newPitchTable) throws StorypitchAlreadyExistsException; 
	String ShowAllByUser(int user_id);
	public PitchTable findPitchTable(PitchTable p);
	
	//modify and pending pitches 
	
	
	
	/*public List<UserInfo> showAllUsers();
	public abstract void delete(UserInfo objToDelete) throws SQLException;
	public abstract void update(UserInfo updatedObj) throws SQLException;
	public  UserInfo findByUsername (UserInfo un) throws UserNotFound;
	public  UserInfo findByUserId (UserInfo uid) throws UserNotFound;
	public UserInfo login(String username, int password) throws UserNotFound;
	UserInfo register(UserInfo newUserInfo) throws UsernameAlreadyExistsException;
	*/
}
	