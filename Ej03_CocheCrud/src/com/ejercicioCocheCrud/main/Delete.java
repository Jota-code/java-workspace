package com.ejercicioCocheCrud.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.ejercicioCocheCrud.utils.UtilData;

public class Delete {

	public static void main(String[] args) {
		
		try (Scanner teclado = new Scanner(System.in); Connection con = UtilData.connect()) {
			
			String sql = "DELETE FROM car WHERE id_car=?";
			
			PreparedStatement prepSt = con.prepareStatement(sql);
			
			System.out.println("Type the car id to proceed with the car deletion");
			int id = teclado.nextInt();
			teclado.nextLine();
			prepSt.setInt(1, id);
			
			System.out.println("Deleting the car ...");
			
		} catch (SQLException e) {
			System.out.println("Error while deleting the car");
			System.out.println(e.getMessage());
		}
	}

}
