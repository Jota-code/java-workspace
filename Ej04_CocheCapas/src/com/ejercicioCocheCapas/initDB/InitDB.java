package com.ejercicioCocheCapas.initDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Esta clase la debemos ejecutar en caso de que queramos usar una bbdd
//derby embebida y no la tengamos
public class InitDB {

	private Connection conexion;

	public static void main(String[] args) {
		InitDB cd = new InitDB();
		cd.crearBBDD();
	}
	
	public boolean abrirConexion(){
		try {
			conexion = DriverManager.getConnection("jdbc:derby:bbdd;create=true");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean cerrarConexion(){
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean crearBBDD() {
		if(!abrirConexion()){
			return false;
		}
		boolean estaCreada = true;
		
		try {
			//Con esto creamos una bbdd enbebida dentro del proyecto 
			Statement state = conexion.createStatement();
			state.execute("create table car(id INT NOT NULL "
					+ "GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), " 
					+ "plate VARCHAR(7) NOT NULL, " 
					+ "brand VARCHAR(100) NOT NULL, "
					+ "model VARCHAR(100) NOT NULL, " 
					+ "km_number INT, "
                    + "CONSTRAINT primary_key PRIMARY KEY (plate)"
                    + ")");
			
		} catch (SQLException e) {
			System.out.println("alta -> Error al crear: ");
			estaCreada = false;
			e.printStackTrace();
		} finally{
			cerrarConexion();
		}
		
		return estaCreada;
	}
}
