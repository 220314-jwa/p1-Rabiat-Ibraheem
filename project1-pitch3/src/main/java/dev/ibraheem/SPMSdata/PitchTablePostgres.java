package dev.ibraheem.SPMSdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import dev.ibraheem.SPMSExceptions.StoryPitchNotFoundException;
import dev.ibraheem.SPMSServices.ConnectionFactory;
import dev.ibraheem.project1.PitchTable;



public class PitchTablePostgres implements PitchTableDAO{
 
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	public static final String insert_command ="Insert into story_pitch values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String update_command ="update story_pitch set tentative_title=?, blurb=?, description=?, number_of_pages=?, completion_timeframe=? where user_id =?";
	public static final String find_command ="select * from story_pitch where user_id=?";
	public static final String find_status_command ="select * from story_pitch where status_name=?";
	public static final String select_all ="select * from story_pitch";
	
	Connection conn = ConnectionFactory.getConnection();

// create a new table
	@Override
	public PitchTable add(PitchTable p) {
		
		Connection conn = ConnectionFactory.getConnection();
		int generatedPitch_Id = 0;
		try {
			pst = conn.prepareStatement(insert_command);
			
			pst.setString(1, p.getTentative_title());
			pst.setString(2, p.getBlurb());
			pst.setString(3, p.getDescription());
			pst.setInt(4, p.getUser_id());
			pst.setInt(5, p.getEditor_id());
			pst.setInt(6, p.getGenre_id());
			pst.setInt(7, p.getNumber_of_pages());
			pst.setInt(8, p.getAuthor_id());
			pst.setString(9, p.getStatus_name());
			pst.setString(10, p.getGenre_name());
			pst.setString(11, p.getUsername());
			pst.setString(12, p.getCompletion_timeframe());
			
			conn.setAutoCommit(false); // for ACID (transaction management)
			pst.executeUpdate();
			ResultSet resultSet = pst.getGeneratedKeys();
			
			if (resultSet.next()) {
				generatedPitch_Id = resultSet.getInt(1);
			} else {
				conn.rollback();
			}
			
		} catch (SQLException e) {
			System.out.println("Unable to add table record");
			e.printStackTrace();
		}
		finally {
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;								/////////////////
	}

	// update the pitch table

	@Override
	public void updatePitchTable(PitchTable p) {
		// TODO Auto-generated method stub
		Connection conn = ConnectionFactory.getConnection();
		
		int i = 0;
		try
		{
			pst = conn.prepareStatement(update_command);
			pst.setInt(6, p.getUser_id());
			pst.setString(1, p.getTentative_title());
			pst.setString(2, p.getBlurb());
			pst.setString(3, p.getDescription());
			pst.setInt(4, p.getNumber_of_pages());
			pst.setString(5, p.getCompletion_timeframe());
			
	}catch (SQLException e1) {
		System.out.println("Unable to update table record");
		e1.printStackTrace();
	}
	finally {
		try {
			pst.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	while (i > 0) {
		System.out.println("The table has been updated Successfully");
		}
	}
	
	// showing all tables
	@Override
	public List<PitchTable> showAllPitches() {
		PitchTable selectAllTemp = null;
		List<PitchTable> plist = new ArrayList<>();
		try {
			pst = conn.prepareStatement(select_all);
		
		rs = pst.executeQuery();
		while (rs.next()){
			selectAllTemp = new PitchTable();
			selectAllTemp.setTentative_title(rs.getString("tentative_title"));
			selectAllTemp.setBlurb(rs.getString("blurb"));
			selectAllTemp.setDescription(rs.getString("description"));
			selectAllTemp.setUser_id(rs.getInt("user_id"));
			selectAllTemp.setEditor_id(rs.getInt("editor_id"));
			selectAllTemp.setGenre_id(rs.getInt("genre_id"));
			selectAllTemp.setNumber_of_pages(rs.getInt("number_of_pages"));
			selectAllTemp.setAuthor_id(rs.getInt("author_id"));
			selectAllTemp.setStatus_name(rs.getString("status_name"));
			selectAllTemp.setGenre_name(rs.getString("genre_name"));
			selectAllTemp.setUsername(rs.getString("username"));
			selectAllTemp.setCompletion_timeframe(rs.getString("completion_timeframe"));
			plist.add(selectAllTemp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return selectAllTemp;
	}



	//Find pitch by Status name, select all by status_name
	@Override
	public PitchTable findPitchTable (PitchTable p) throws StoryPitchNotFoundException {
		PitchTable findTemp = null;
		
			try {
				pst = conn.prepareStatement(find_status_command);
			
			pst.setString(1, p.getStatus_name());
			rs = pst.executeQuery();
			if (!rs.next()){
				throw new StoryPitchNotFoundException();
			}
			
			findTemp = new PitchTable();
			findTemp.setTentative_title(rs.getString("tentative_title"));
			findTemp.setBlurb(rs.getString("blurb"));
			findTemp.setDescription(rs.getString("description"));
			findTemp.setUser_id(rs.getInt("user_id"));
			findTemp.setEditor_id(rs.getInt("editor_id"));
			findTemp.setGenre_id(rs.getInt("genre_id"));
			findTemp.setNumber_of_pages(rs.getInt("number_of_pages"));
			findTemp.setAuthor_id(rs.getInt("author_id"));
			findTemp.setStatus_name(rs.getString("status_name"));
			findTemp.setGenre_name(rs.getString("genre_name"));
			findTemp.setUsername(rs.getString("username"));
			findTemp.setCompletion_timeframe(rs.getString("completion_timeframe"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
					try {
						pst.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			return findTemp;
			}


	@Override
	public Set<PitchTable> getByEditorId(Integer editor_id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Set<PitchTable> getByStatus(String status_name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PitchTable getById(Integer user_id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Set<PitchTable> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean delete(PitchTable t) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean update(PitchTable t) {
		// TODO Auto-generated method stub
		return false;
	}


}


//@Override
//public int create(PitchTable newObj) {
//		int generatedId = 0;
//		Connection conn = ConnectionFactory.getConnection();
//		
//			String sql = "insert into story_pitch (tentative_title, blurb, description, user_id, editor_id, genre_id, "
//					+ "number_of_pages, author_id, expected_completion_date, status_name, genre_name)"
//					+ " values(?,?,?,?,?,?,?,?,?,?,?)";
//			
//			try {
//	            // create a prepared statement, we pass in the sql command
//	            // also the flag "RETURN_GENERATED_KEYS" so we can get that id that is generated
//	            PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
//	            // set the fields:
//	            preparedStatement.setString(1, newObj.getName());
//	            preparedStatement.setString(2, newObj.getSpecies());
//	            preparedStatement.setString(3, newObj.getDescription());
//	            preparedStatement.setInt(4, newObj.getAge());
//
//	            // shortcut for now, but we need the corresponding id for the status
//	            int status_id;
//	            if (newObj.getStatus().equals("Available")) {
//	                status_id = 1;
//	            }
//	            else {
//	                status_id = 2;
//	            }
//	            preparedStatement.setInt(5, status_id);
//	            
//	            connection.setAutoCommit(false); // for tx management (ACID)
//	            // execute this command, return number of rows affected:
//	            int count = preparedStatement.executeUpdate();
//	            // lets us return the id that is auto-generated
//	            ResultSet resultSet = preparedStatement.getGeneratedKeys();
//	            // if we affected one or more rows:
//	            if (count > 0) {
//	                System.out.println("Pet added!");
//	                // return the generated id:
//	                // before we call resultSet.next(), it's basically pointing to nothing useful
//	                // but moving that pointer allows us to get the information that we want
//	                resultSet.next();
//	                int id = resultSet.getInt(1);
//	                newObj.setId(id);
//	                connection.commit(); // commit the changes to the DB
//	            }
//	            // if 0 rows are affected, something went wrong:
//	            else {
//	                System.out.println("Something went wrong when trying to add pet!");
//	                connection.rollback(); // rollback the changes
//	            }
//	        } catch (SQLException e){
//	            // print out what went wrong:
//	            e.printStackTrace();
//	            try {
//					connection.rollback();
//				} catch (SQLException e1) {
//					e1.printStackTrace();
//				}
//	        } finally {
//	        	try {
//					connection.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//	        }
//	        
//	        return newObj.getId();
//	    }
//
//			PreparedStatement pStmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
//			pStmt.setString(1, newObj.getTentative_title());
//			pStmt.setString(2, newObj.getBlurb());
//			pStmt.setString(3, newObj.getDescription());
//			pStmt.setInt(4, ());
//			pStmt.setInt(5, ());
//			pStmt.setInt(6, ());
//			pStmt.setInt(7, newObj.getNumber_of_pages());
//			pStmt.setInt(8, newObj.getAuthor_id());
//			pStmt.setString(9, newObj.getExpected_completion_date());
//			pStmt.setInt(10, newObj.getStatus_name());
//			pStmt.setInt(10, newObj.getGenre_name());
//			
//			conn.setAutoCommit(false); // for ACID (transaction management)
//			pStmt.executeUpdate();
//			ResultSet resultSet = pStmt.getGeneratedKeys();
//			
//			if (resultSet.next()) {
//				generatedId = resultSet.getInt(1);
//				conn.commit();
//			} else {
//				conn.rollback();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//			try {
//				conn.rollback();
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//		} finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//		return generatedId;
//	}
