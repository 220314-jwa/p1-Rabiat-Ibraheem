package dev.ibraheem.SPMSDataBeans;

import java.util.Objects;

public class PitchTablePsql {
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

	public PitchTablePsql() {
			 pitch_id = 0;
			 tentative_title = "";
			 blurb = "";
			 description = "";
			 user_id = 0;
			 editor_id = 0;
			 genre_id = 0;
			 number_of_pages = 0;
			 author_id = 0;
			 status_name = "";
			 genre_name  = "";
			 username  = "";
			 completion_timeframe = "";
			}

	@Override
	public String toString() {
		return "PitchTablePsql [pitch_id=" + pitch_id + ", tentative_title=" + tentative_title + ", blurb=" + blurb
				+ ", description=" + description + ", user_id=" + user_id + ", editor_id=" + editor_id + ", genre_id="
				+ genre_id + ", number_of_pages=" + number_of_pages + ", author_id=" + author_id + ", status_name="
				+ status_name + ", genre_name=" + genre_name + ", username=" + username + ", completion_timeframe="
				+ completion_timeframe + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author_id, blurb, completion_timeframe, description, editor_id, genre_id, genre_name,
				number_of_pages, pitch_id, status_name, tentative_title, user_id, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PitchTablePsql other = (PitchTablePsql) obj;
		return author_id == other.author_id && Objects.equals(blurb, other.blurb)
				&& Objects.equals(completion_timeframe, other.completion_timeframe)
				&& Objects.equals(description, other.description) && editor_id == other.editor_id
				&& genre_id == other.genre_id && Objects.equals(genre_name, other.genre_name)
				&& number_of_pages == other.number_of_pages && pitch_id == other.pitch_id
				&& Objects.equals(status_name, other.status_name)
				&& Objects.equals(tentative_title, other.tentative_title) && user_id == other.user_id
				&& Objects.equals(username, other.username);
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

	
}
