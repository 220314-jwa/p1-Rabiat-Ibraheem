package dev.ibraheem.project1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import dev.ibraheem.SPMSExceptions.StoryPitchNotFoundException;
import dev.ibraheem.SPMSdata.PitchTableDAO;


public class PitchTable implements List<PitchTable>  {
	private int pitch_id;
	private String tentative_title;
	private String blurb;
	private String description;
	private int user_id;
	private int editor_id;
	private int genre_id;
	private int number_of_pages;
	private int author_id;
	private String status_name;
	private String genre_name;
	private String username;
	private String completion_timeframe;
	public PitchTable() {
		super();
		// TODO Auto-generated constructor stub
	
	}
	
	public PitchTable(int pitch_id, String tentative_title, String blurb, String description, int user_id,
			int editor_id, int genre_id, int number_of_pages, int author_id, 
			String status_name, String genre_name, String username, String  completion_timeframe ) {
		super();
		
		this.pitch_id = pitch_id;
		this.tentative_title = tentative_title;
		this.blurb = blurb;
		this.description = description;
		this.user_id = user_id;
		this.editor_id = editor_id;
		this.genre_id = genre_id;
		this.number_of_pages = number_of_pages;
		this.author_id = author_id;
		this.status_name = status_name;
		this.genre_name = genre_name;
		this.username = username;
		this. completion_timeframe = completion_timeframe;
	}
	public int getPitch_id() {
		return pitch_id;
	}
	public void setPitch_id(int pitch_id) {
		this.pitch_id = pitch_id;
	}
	public String getTentative_title() {
		return tentative_title;
	}
	public void setTentative_title(String tentative_title) {
		this.tentative_title = tentative_title;
	}
	public String getBlurb() {
		return blurb;
	}
	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getEditor_id() {
		return editor_id;
	}
	public void setEditor_id(int editor_id) {
		this.editor_id = editor_id;
	}
	public int getGenre_id() {
		return genre_id;
	}
	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}
	public int getNumber_of_pages() {
		return number_of_pages;
	}
	public void setNumber_of_pages(int number_of_pages) {
		this.number_of_pages = number_of_pages;
	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	
	public String getStatus_name() {
		return status_name;
	}
	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}
	public String getGenre_name() {
		return genre_name;
	}
	public void setGenre_name(String genre_name) {
		this.genre_name = genre_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCompletion_timeframe() {
		return completion_timeframe;
	}
	public void setCompletion_timeframe(String completion_timeframe) {
		this.completion_timeframe = completion_timeframe;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<PitchTable> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(PitchTable e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends PitchTable> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends PitchTable> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PitchTable get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PitchTable set(int index, PitchTable element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, PitchTable element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PitchTable remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<PitchTable> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<PitchTable> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PitchTable> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	}		