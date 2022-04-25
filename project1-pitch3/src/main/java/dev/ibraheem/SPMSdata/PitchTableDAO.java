package dev.ibraheem.SPMSdata;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import dev.ibraheem.SPMSExceptions.StoryPitchNotFoundException;
import dev.ibraheem.project1.PitchTable;

public interface PitchTableDAO	{	// extends GenericDAO<PitchTable> {
	
/*	public abstract void addPitchTable (PitchTable p);
	public abstract void updatePitchTable (PitchTable p);
	public  PitchTable findPitchTable (PitchTable p) throws StoryPitchNotFoundException;
	public List<PitchTable> showAllPitches();
	public List<PitchTable> getByEditor(int editor_id);
	public List<PitchTable> getByUserInfo(int user_id);
	public List<PitchTable> getByUsername(String username);
*/
		public Set<PitchTable> getByEditorId(Integer editor_id);
	
		public Set<PitchTable> getByStatus(String status_name);
	
		public PitchTable getById(Integer user_id);
	
		public  PitchTable add(PitchTable p);
		
		public Set<PitchTable> getAll();
	
		public boolean delete(PitchTable t);
	
		public boolean update(PitchTable t);

		public void updatePitchTable(PitchTable p);

		PitchTable findPitchTable(PitchTable p) throws StoryPitchNotFoundException;

		List<PitchTable> showAllPitches();
	
	
	
		

	
	}

//	
//	public List<Pitch_table> getByEditor(int editor_id);
//	public List<Pitch_table> getByAuthor(int author_id);
//	public List<Pitch_table> getByStatus_name(String status_name);
//	public List<Pitch_table> getByRole_id(int role_id, int user_id);
//	public void updatePitch_table(int pitch_id, String tentative_title, String blurb, String description, int user_id,
//			int editor_id, int genre_id, int word_count_length, int author_id, int expected_completion_date, String status_name, String genre_name)
//			throws SQLException;
//	public Object getByUserInfo(Pitch_table pitchtable);
//	public void setPitch(Object byUserInfo);
//	public List<Pitch_table> getByEditorInfo(UserInfo userInfo);
//	
//}
//
