package dev.ibraheem.SPMSdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import dev.ibraheem.SPMSExceptions.UserNotFound;
import dev.ibraheem.SPMSServices.ConnectionFactory;
import dev.ibraheem.project1.UserInfo;
import dev.ibraheem.project1.PitchTable;


public class UserPostgres implements UserInfoDAO {
	
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	public static final String insert_command ="Insert into user_info values(?,?,?,?,?,?,?)";
	public static final String update_command ="update user_info set first_name=?, last_name=?, role_id=?, role_name=?, username=?, passwrd=? where user_id =?";
	public static final String find_uid_command ="select * from user_info where user_id=?";
	public static final String find_un_command ="select * from user_info where username=?";
	public static final String select_all ="select * from user_info";

	Connection conn = ConnectionFactory.getConnection();
	
// To display all users
@Override
public List<UserInfo> showAllUsers() {
		UserInfo usrInfo = null;
		List<UserInfo> usrlist = new ArrayList<>();
		
		try {
			pst = conn.prepareStatement(select_all);
			rs = pst.executeQuery();
			while (rs.next()) {
				usrInfo = new UserInfo();
				usrInfo.setUser_id(rs.getInt("user_id"));
				usrInfo.setFirst_name(rs.getString("first_name"));
				usrInfo.setLast_name(rs.getString("last_name"));
				usrInfo.setRole_id(rs.getInt("role_id"));
				usrInfo.setRole_name(rs.getString("role_name"));
				usrInfo.setUsername(rs.getString("username"));
				usrInfo.setPassword(rs.getString("passwrd"));
				usrlist.add(usrInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usrInfo;
	}

@Override
public int create(UserInfo newObj) {
	int generatedId = 0;
	Connection conn = ConnectionFactory.getConnection();
	try {
		String sql = "insert into userinfo (first_name, last_name, role_id, username, passwd)"
				+ " values (?,?,?,?)";
		PreparedStatement pStmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		pStmt.setString(1, newObj.getFirst_name());
		pStmt.setString(2, newObj.getLast_name());
		pStmt.setString(4, newObj.getUsername(sql));
		pStmt.setString(5, newObj.getPassword());
		pStmt.setInt(3, 300);
		
		conn.setAutoCommit(false); // for ACID (transaction management)
		pStmt.executeUpdate();
		ResultSet resultSet = pStmt.getGeneratedKeys();
		
		if (resultSet.next()) {
			generatedId = resultSet.getInt(1);
			conn.commit();
		} else {
			conn.rollback();
		}
	} catch (SQLException e) {
		e.printStackTrace();
		try {
			conn.rollback();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	} finally {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	return generatedId;
}

//To update current user_info table; to add a new user
@Override
public void update(UserInfo updatedObj) throws SQLException {
	Connection conn = ConnectionFactory.getConnection(); 
	try {
		String sql = "update user_info set first_name, last_name, role_id, username, passwrd)"
				+ "where user_id=?";
		PreparedStatement pStmt = conn.prepareStatement(sql);
		pStmt.setString(1, updatedObj.getFirst_name());
		pStmt.setString(2, updatedObj.getLast_name());
		pStmt.setString(4, updatedObj.getUsername(sql));
		pStmt.setString(5, updatedObj.getPassword());
		pStmt.setInt(3, 300);
		pStmt.setInt(6, updatedObj.getUser_id());
		
		conn.setAutoCommit(false); // for ACID (transaction management)
		int rowsUpdated = pStmt.executeUpdate();
		
		if (rowsUpdated==1) {
			conn.commit();
		} else {
			conn.rollback();
			throw new SQLException("ERROR: no object found to update");
		}
	} catch (SQLException e) {
		e.printStackTrace();
		try {
			conn.rollback();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		throw e;
	} finally {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

// To delete users
@Override
public void delete(UserInfo objToDelete) throws SQLException {
	// TODO Auto-generated method stub
		Connection conn = ConnectionFactory.getConnection();
		try {
			String sql = "delete from user_info where user_id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, objToDelete.getUser_id());
			
			conn.setAutoCommit(false); // for ACID (transaction management)
			int rowsUpdated = pStmt.executeUpdate();
			
			if (rowsUpdated==1) {
				conn.commit();
			} else {
				conn.rollback();
				throw new SQLException("ERROR: no object found to delete");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw e;
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


@Override
public  UserInfo findByUserId(int user_id) throws UserNotFound {
		UserInfo findTmp = null;
		try {
			pst = conn.prepareStatement(find_uid_command);
		
		pst.setInt(1, user_id);
		rs = pst.executeQuery();
		if (!rs.next()){
			throw new UserNotFound();
		}
		
		findTmp = new UserInfo();
		findTmp.setFirst_name(rs.getString("first_name"));
		findTmp.setLast_name(rs.getString("last_name"));
		findTmp.setRole_id(rs.getInt("role_id"));
		findTmp.setRole_name(rs.getString("role_name"));
		findTmp.setUsername(rs.getString("username"));
		findTmp.setPassword(rs.getString("passwrd"));
		
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}finally {
				try {
					pst.close();
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
		}
		return findTmp;
}


@Override
public UserInfo findByUsername(String username) {
	UserInfo findUn = null;
	
	try {
		pst = conn.prepareStatement(find_un_command);
	
	pst.setString(1, username);
	rs = pst.executeQuery();
	if (!rs.next()){
		throw new UserNotFound();
	}
	
	findUn = new UserInfo();
	findUn.setFirst_name(rs.getString("first_name"));
	findUn.setLast_name(rs.getString("last_name"));
	findUn.setRole_id(rs.getInt("role_id"));
	findUn.setRole_name(rs.getString("role_name"));
	findUn.setUsername(rs.getString("username"));
	findUn.setPassword(rs.getString("passwrd"));
	
	} catch (SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	} catch (UserNotFound e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
			try {
				pst.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
	}
	return findUn;

	}

}