package com.ejercicioCocheCrud.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.ejercicioCocheCrud.utils.UtilData;

public class Insert {
	
	public static void main(String[] args) {
		
		
		
		try (Connection con = UtilData.connect(); Scanner teclado = new Scanner(System.in);) {
			
			String sql = "INSERT INTO car (brand,model,kmNumber) VALUES (?,?,?)";
			
			
			PreparedStatement prepSt;
			prepSt = con.prepareStatement(sql);
			System.out.println("Type the brand of the car");
			String brand = teclado.nextLine();
			prepSt.setString(1, brand);
			System.out.println("Type the model of the car");
			String model = teclado.nextLine();
			prepSt.setString(2, model);
			System.out.println("Type the number of km");
			int kmNumber = teclado.nextInt();
			teclado.nextLine();
			prepSt.setInt(3, kmNumber);
			System.out.println("Adding new car ...");
			
			prepSt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error adding new car");
			System.out.println(e.getMessage());
		}
		
	}

}
