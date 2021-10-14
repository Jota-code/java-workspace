package com.ejercicioCocheCrud.main;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

	

	//Ejemplo de conexiones java usando el estandar de JDBC (Java DataBase Connection)
	//Son un conjunto de interfaces que marcan como se tienen que hacer las conexiones
	//a BBDD de todos los fabricantes de las BBDD que haya.

		public static void main(String[] args) {
			
			// Paso 0: Cargar el driver que se va a usar para las conexiones a la BBDD
			// Solo hace falta hacerlo una vez en todo el programa
			// El driver ser� usado por jdbc para las conexiones, y dependera del fabricante
			// de la bbdd y de su version
			
			// IMPORTANTE: Esto se hacia en versiones de java anteriores a la 1.7 y con drivers
			// antiguos (com.mysql.jdbc.Driver). A fecha actual JAVA carga automaticamente
			// los drivers de conexi�n (com.mysql.cj.jdbc.Driver). Notese que sigue siendo
			// necesario cargar el jar con las clases de conexion en el classpath de java
			/*try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("No se ha encontrado el driver para MySQL");
				return;
			}
			
			System.out.println("Se ha cargado el Driver de MySQL");*/
					
			// Paso 1: Establecer conexi�n con la base de datos
			// En la cadena de conexion podemos encontrar los siguientes valores
			// jdbc, este es el protocolo de conexion
			// mysql, este es el subprotocolo y tiene con la bbdd
			// localhost, esta es la IP a la que nos queremos conectar
			// 3306, el puerto por el que nos vamos a contectar, por defecto mysql es el 3306
			// bbdd, es el esquema de la bbdd a al que nos queremos conectar
			String cadenaConexion = "jdbc:mysql://localhost:3306/bbdd";
			String user = "root";
			String pass = ""; // sustituye por la contrase�a que especificaste durante la instalaci�n de MySQL.
			
			//Paso 2: crear el objeto que realizar� la conexi�n, este paso habra que hacerlo
			//tantas veces como queramos acceder a nuestra bbdd
			Connection con = null;
			try {
				//DriverManager es una clase que gestiona las conexiones, y aqui le
				//pedimos una conexion
				con = DriverManager.getConnection(cadenaConexion, user, pass);
			} catch (SQLException e) {
				System.out.println("No se ha podido establecer la conexi�n con la BD");
				System.out.println(e.getMessage());
				return;
			}
			
			System.out.println("Se ha establecido la conexi�n con la Base de datos");
			
			// Paso 3: Interactuar con la BD (Se ver� en puntos siguientes)
			// Aqu� ir�an las queries
			
			// Paso 4: Cerrar la conexi�n (Tambien podriamos poner la referencia con
			// en un try-catch autoclose para que se cierre autom�ticamente
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("No se ha podido cerrar la conexi�n con la BD");
				System.out.println(e.getMessage());
				return;
			}
			System.out.println("Se ha cerrado la base de datos");

		}

	}


