package dev.ibraheem.project1;
import java.sql.Date;

public class Editor {
	private int editor_id;
	private String first_name;
	private String last_name;
	private int reports_to;
	private Date hire_date;
	private int user_id;
	public Editor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Editor(int editor_id, String first_name, String last_name, int reports_to, Date hire_date, int user_id) {
		super();
		this.editor_id = editor_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.reports_to = reports_to;
		this.hire_date = hire_date;
		this.user_id = user_id;
	}
	public int getEditor_id() {
		return editor_id;
	}
	public void setEditor_id(int editor_id) {
		this.editor_id = editor_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getReports_to() {
		return reports_to;
	}
	public void setReports_to(int reports_to) {
		this.reports_to = reports_to;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}