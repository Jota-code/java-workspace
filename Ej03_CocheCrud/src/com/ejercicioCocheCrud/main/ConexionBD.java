package com.ejercicioCocheCrud.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	private static Connection con = null;
	private static final String connection = "jdbc:mysql://localhost:3306/";
	private static final String dbName = "bbdd";
	private static final String user = "root";
	private static final String pass = "";

	public static void main(String[] args) {
		
		String cadenaConexion = "jdbc:mysql://localhost:3306/bbdd";
		String user = "root";
		String pass = "";
		
		
		con = null;
		
		try {
			con = DriverManager.getConnection(cadenaConexion,user,pass);
		} catch (SQLException e) {
			System.out.println("No se ha podido establecer la conexion con la BD");
			System.out.println(e.getMessage());
			System.out.println("Creando base de datos");
			createDB();
			e.printStackTrace();
			return;
		}

	}

	private static void createDB() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/",user,pass);
			System.out.println("Creating database bbdd");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
