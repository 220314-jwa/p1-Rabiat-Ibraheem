package dev.ibraheem.SPMSServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import dev.ibraheem.SPMSExceptions.IncorrectCredentialsException;
import dev.ibraheem.SPMSExceptions.StoryPitchNotFoundException;
import dev.ibraheem.SPMSExceptions.StorypitchAlreadyExistsException;
import dev.ibraheem.SPMSExceptions.UserNotFound;
import dev.ibraheem.SPMSExceptions.UsernameAlreadyExistsException;
import dev.ibraheem.SPMSdata.DAOFactory;
import dev.ibraheem.SPMSdata.PitchTableDAO;
import dev.ibraheem.SPMSdata.UserInfoDAO;
import dev.ibraheem.SPMSdata.UserPostgres;
import dev.ibraheem.project1.PitchTable;
import dev.ibraheem.project1.UserInfo;


//implements user services interface
public  class UserServicesImp implements UserServices{
	private UserInfoDAO userinfoDao = DAOFactory.getUserInfoDAO();
	private PitchTableDAO pitchTableDao = DAOFactory.getPitchTableDAO();

	@Override
	public UserInfo register(UserInfo newUserInfo)throws UsernameAlreadyExistsException {
		int user_id = UserInfo.create(newUserInfo);
		if (user_id != 0) {
			newUserInfo.setUser_id(user_id);
			return newUserInfo;
		} else {
			throw new UsernameAlreadyExistsException();
		}
	}
	// If the user has an author id, they can create & submit a new pitch
	/*@Override
	public PitchTable newPitch(PitchTable newPitchTable) throws StorypitchAlreadyExistsException {
	PitchTable author_id = new PitchTable();
		return newPitchTable;
}*/

	@Override
	public UserInfo logIn(String username, String password)throws IncorrectCredentialsException  {
	UserInfo userInfo = new UserInfo();
		if (username != null && userInfo.getPassword().equals(password)) {
			return userInfo;
		} else {
			throw new IncorrectCredentialsException();
		}
	
	}
	@Override
	public PitchTable createNewPitch(String tentative_title) throws StorypitchAlreadyExistsException {
		PitchTable pitchTable = new PitchTable();
		if (tentative_title != null && pitchTable.getTentative_title().equals(tentative_title)) {
			return new PitchTable();
		} else {
			throw new StorypitchAlreadyExistsException();
		}
	
	}

	@Override
	//public String ShowAllByUser(int user_id) {
		public PitchTable findPitchTable (PitchTable p) {
		PitchTable pitchHistory = null;
		try (Connection conn = ConnectionFactory.getConnection())	{
			String sql = "select * from story_pitch when user_id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, p.getUser_id());
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()){
				
			
			
			pitchHistory = new PitchTable();
			pitchHistory.setTentative_title(rs.getString("tentative_title"));
			pitchHistory.setBlurb(rs.getString("blurb"));
			pitchHistory.setDescription(rs.getString("description"));
			pitchHistory.setUser_id(rs.getInt("user_id"));
			pitchHistory.setEditor_id(rs.getInt("editor_id"));
			pitchHistory.setGenre_id(rs.getInt("genre_id"));
			pitchHistory.setNumber_of_pages(rs.getInt("number_of_pages"));
			pitchHistory.setAuthor_id(rs.getInt("author_id"));
			pitchHistory.setStatus_name(rs.getString("status_name"));
			pitchHistory.setGenre_name(rs.getString("genre_name"));
			pitchHistory.setUsername(rs.getString("username"));
			pitchHistory.setCompletion_timeframe(rs.getString("completion_timeframe"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
					
			}
			return pitchHistory;
			}

	@Override
	public PitchTable checkByStatus(int author_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PitchTable> viewByStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ShowAllByUser(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
	


//		private UserInfoDAO userInfoDao = DAOFactory.getUserInfoDAO();
//		private PitchTableDAO pitchDao = DAOFactory.getPitchTableDAO();
//		
//		
//	@Override
//	public UserInfo register(UserInfo newUserInfo)throws usernameAlreadyExistsException {
//		int user_id = userInfoDao.create(newUserInfo);
//		if (user_id != 0) {
//			newUserInfo.setUser_id(user_id);
//			return newUserInfo;
//		} else {
//			throw new usernameAlreadyExistsException();
//		}
//	}
//	
//	@Override
//	public Pitch_table newPitch(Pitch_table newPitch_table) throws StorypitchAlreadyExistsException {
//		Pitch_table author_id = new Pitch_table();
//			return newPitch_table;
//	}
//	
//	@Override
//	public UserInfo logIn(String username, int password)throws IncorrectCredentialsException  {
//		UserInfo userInfo = userInfoDao.getByUsername(username);
//			if (userInfo != null && userInfo.getPassword()==(password)) {
//				return userInfo;
//			} else {
//				throw new IncorrectCredentialsException();
//			}
//	}
//
//	@Override
//	public List<Pitch_table> viewExistingPitches(int user_id) {
//			return pitchDao.getByAuthor(user_id);
//	}
//	
//	@Override
//	public List<Pitch_table> viewExistingPitches() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Pitch_table newPitch(String tentative_title) throws StorypitchAlreadyExistsException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public List<UserInfo> getByUserId(int user_id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
//
//	
//
//
//	
//}