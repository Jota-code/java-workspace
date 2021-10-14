package com.ejercicioCocheCrud.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.ejercicioCocheCrud.utils.UtilData;

public class Update {

	public static void main(String[] args) {
		
		try (Scanner teclado = new Scanner(System.in); Connection con = UtilData.connect();) {
			String sql = "UPDATE car SET brand=?, model=?, kmNumber=? WHERE id_car=?";
			
			PreparedStatement prepSt = con.prepareStatement(sql);
			
			System.out.println("Type the id from the car");
			int id = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Type the new brand of the car");
			String brand = teclado.nextLine();
			System.out.println("Type the model of the car");
			String model = teclado.nextLine();
			System.out.println("Type the number of km of the car");
			int kmNumber = teclado.nextInt();
			teclado.nextLine();
			
			prepSt.setString(1, brand);
			prepSt.setString(2, model);
			prepSt.setInt(3, kmNumber);
			prepSt.setInt(4, id);
			
			prepSt.executeUpdate();
		
			
		} catch (SQLException e) {
			System.out.println("Error updating the car");
			System.out.println(e.getMessage());
		}

	}

}
