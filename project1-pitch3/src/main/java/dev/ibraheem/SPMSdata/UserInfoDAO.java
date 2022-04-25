package dev.ibraheem.SPMSdata;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import dev.ibraheem.SPMSExceptions.StoryPitchNotFoundException;
import dev.ibraheem.SPMSExceptions.UserNotFound;
import dev.ibraheem.project1.PitchTable;
import dev.ibraheem.project1.UserInfo;

public interface UserInfoDAO	{ //extends GenericDAO<UserInfo> {
	
//	UserInfo getById(Integer id);

//	Set<UserInfo> getAll();

//	boolean update(UserInfo t);	//

//	boolean delete(UserInfo t);	//

//	UserInfo add(UserInfo c);

//	UserInfo getByUsername(String username);

	List<UserInfo> showAllUsers();	//

	UserInfo findByUserId(int user_id) throws UserNotFound;

	UserInfo findByUsername(String username);

	void update(UserInfo updatedObj) throws SQLException;

	void delete(UserInfo objToDelete) throws SQLException;

	int create(UserInfo newObj);
	
}
	
	//////////////////////////////////////////////////////////
/*	public List<UserInfo> showAllUsers();
	public abstract void delete(UserInfo objToDelete) throws SQLException;
	public abstract void update(UserInfo updatedObj) throws SQLException;
	public  UserInfo findByUsername (UserInfo username) throws UserNotFound;
	public  UserInfo findByUserId (UserInfo uid) throws UserNotFound;
	//public static UserInfo findByUsername(String username) {
		// TODO Auto-generated method stub
		//return null;
	UserInfo findByUsername(String username) throws UserNotFound;
	}
	
*/



