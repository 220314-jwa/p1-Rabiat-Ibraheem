package dev.ibraheem.SPMSdata;
import java.sql.SQLException;
import java.util.List;

import dev.ibraheem.project1.Editor;
import dev.ibraheem.project1.PitchTable;
import dev.ibraheem.project1.UserInfo;

//EditorDAO inherits the genericDAO so whichever class 
//implements the interface would get the types for the Editor table
public interface EditorDAO	{ // extends GenericDAO<EditorDAO>{
	
	public List<PitchTable> showAllPitches();
	public List<PitchTable> getByEditor(int editor_id);
	
/*	Decision getById(Integer id);

	Set<Decision> getAll();

	boolean update(Decision t);

	boolean delete(Decision t);

	Decision add(Decision c) throws Exception;

	Set<Decision> getByEditorId(Integer editorId);

	Set<Decision> getByPitchId(Integer pitchId);
*/	
}
	
/*	
//	public abstract void delete(UserInfo objToDelete) throws SQLException;
//	public abstract void update(UserInfo updatedObj) throws SQLException;
	public List<PitchTable> showAllPitches();
//	public List<PitchTable> getByEditor(int editor_id);
//	public List<PitchTable> getByUserInfo(int user_id);
//	public List<PitchTable> getByUsername(String username);
}
*/
