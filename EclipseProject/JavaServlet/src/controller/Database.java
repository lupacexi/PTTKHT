package controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;

public class Database {

	private static Connection con;
	private static String URL;
	private static String USER;
	private static String PASSWORD;

	public static Connection getConnection() {
		con = null;
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(new File("config/mysql.properties")));
			URL = properties.getProperty("url");
			USER = properties.getProperty("user");
			PASSWORD = properties.getProperty("password");

			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (IOException | SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return (con);
	}

	public static void freeConnection() {
		try {
			con.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void main(String[] args) {
		Connection c = getConnection();
		if (c == null) {
			System.out.println("something wrong");
		} else {
			System.out.println("ok");
		}
	}
}
