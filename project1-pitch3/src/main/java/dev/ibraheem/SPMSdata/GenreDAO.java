package dev.ibraheem.SPMSdata;

import java.util.List;
import java.util.Set;
import dev.ibraheem.project1.Genre;
	
public interface GenreDAO	{ // extends GenericDAO<Genre>{
	
	public Set<Genre> getAll();
	public Set<Genre> getByGenreID(int genre_id);
	public Genre getByGenreName(String genre_name);
	
}
//}
//
//public interface GenreDAO extends GenericDAO<Genre>{
//	public List<Genre> getAll();
//
//}
