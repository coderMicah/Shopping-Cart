package com.micah.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if(connection == null)
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_cart","root","MySql@2020");
			System.out.print("conected");
		}
		return connection;
	}

	public static void setConnection(Connection connection) {
		DBConnection.connection = connection;
	}

	
}
