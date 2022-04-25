package dev.ibraheem.SPMSmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCPostgresConnect {

	//jdbc url
	//jdbc username
	//jdbc password
	public static void main (String[] args)	{
	 String url = "jdbc:postgresql://localhost:5432/postgres";
	 String username = "postgres";
	 String password = "password1";
	
	try	{
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(" Connection successful!");
		
		connection.close();
		
	}catch (SQLException e)	{
		System.out.println(" Connection error. Review Postgres connection setup");
		e.printStackTrace();
	}
	
	
	}
}