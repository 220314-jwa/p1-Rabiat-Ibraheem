package dev.ibraheem.SPMSdata;


import java.sql.SQLException;
import java.util.List;
import java.util.Set;

	public interface GenericDAO <T> {
		// CRUD operations (create, read, update, delete)
		public List<T> showAll();	
		
		
		public int create(T newObj); // returns the generated ID
		public T getById(int id); // read one
	//	public List<T> getAll(); // read all
		public Set<T> getAll(); 
		//public List<T> getAll();
		public boolean update(T updatedObj) throws SQLException;
		public boolean delete(T objToDelete) throws SQLException;
		
	//	public void update(T updatedObj) throws SQLException;
		//public void delete(T objToDelete) throws SQLException;
	}




