package com.ejercicioCocheCrud.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.ejercicioCocheCrud.utils.UtilData;


public class ConexionBD {
	
	static Connection con = null;
	

	public static void main(String[] args) {
		
		
		String user = "root";
		String pass = "";
		
		
		con = null;
		
		try {
			con = DriverManager.getConnection(UtilData.getCadenaconexion(),user,pass);
			System.out.println("Conectado a la base de datos "+UtilData.getDbname());
		} catch (SQLException e) {
			System.out.println("No se ha podido establecer la conexion con la BD");
			System.out.println(e.getMessage());
			createDB();
			
			return;
		}

	}

	private static void createDB() {
		try {
			con = DriverManager.getConnection(UtilData.getConnection(),UtilData.getUser(),UtilData.getPass());
			System.out.println("Creating database bbdd");
			String sql = UtilData.getDatabaseBbdd();
			Statement st = con.createStatement();
			st.executeUpdate(sql);
			System.out.println("Database created, now jumping into it");
			sql = "USE bbdd";
			st.executeUpdate(sql);
			System.out.println("Now creating table Car ...");
			sql = UtilData.getTableCar();
			st.executeUpdate(sql);
			System.out.println("Table Car created, now begining with the program");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
