package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppDbConnection {
	public static Connection connection;
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql/localhost::3306/project1";
		String username="root";
		String password ="Krishsql99@";
		connection =DriverManager.getConnection(url, username, password);
		return connection;
		
	}

}
