package com.app.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConnection {
	public static Connection connection;
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/players";
		String userName="root";
		String password="Krishsql99@";
		connection=DriverManager.getConnection(url,userName,password);
		return connection;
		
	}

}
