package com.ejercicioCocheCrud.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilData {

	private static final String cadenaConexion = "jdbc:mysql://localhost:3306/bbdd";
	private static final String DATABASE_BBDD = "CREATE DATABASE bbdd";
	private static final String TABLE_CAR = "CREATE TABLE car" 
			+ "(" 
			+ "id_car INT(5) NOT NULL AUTO_INCREMENT," 
			+ "brand VARCHAR(50)," 
			+ "model VARCHAR(50),"
			+ "kmNumber INT(6),"
			+ "PRIMARY KEY (id_car)" 
			+ ")";
	
	private static final String connection = "jdbc:mysql://localhost:3306/";
	private static final String dbName = "bbdd";
	private static final String user = "root";
	private static final String pass = "";

	public static String getCadenaconexion() {
		return cadenaConexion;
	}

	public static String getDatabaseBbdd() {
		return DATABASE_BBDD;
	}

	public static String getTableCar() {
		return TABLE_CAR;
	}

	public static String getConnection() {
		return connection;
	}

	public static String getDbname() {
		return dbName;
	}

	public static String getUser() {
		return user;
	}

	public static String getPass() {
		return pass;
	}
	
	public static Connection connect() throws SQLException	{
		Connection con = DriverManager.getConnection(cadenaConexion,user,pass);
	
		return con;
	}

}
