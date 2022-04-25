package dev.ibraheem.project1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class UserInfo implements List<UserInfo> {
	
	private int user_id;
	private int role_id;
	private String first_name;
	private String last_name;
	private String role_name; 
	private String username;
	private String password;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(int user_id, int role_id, String first_name, String last_name, String role_name, String username,
			String password) {
		super();
		this.user_id = user_id;
		this.role_id = role_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.role_name = role_name;
		this.username = username;
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
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
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getUsername(String username) {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public Iterator<UserInfo> iterator() {
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
	public boolean add(UserInfo e) {
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
	public boolean addAll(Collection<? extends UserInfo> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int index, Collection<? extends UserInfo> c) {
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
	public UserInfo get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UserInfo set(int index, UserInfo element) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int index, UserInfo element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public UserInfo remove(int index) {
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
	public ListIterator<UserInfo> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<UserInfo> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<UserInfo> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	public static int create(UserInfo newUserInfo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}