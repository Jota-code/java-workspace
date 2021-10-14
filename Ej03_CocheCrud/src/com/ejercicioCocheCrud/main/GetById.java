package com.ejercicioCocheCrud.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.ejercicioCocheCrud.utils.UtilData;

public class GetById {

	public static void main(String[] args) {
		
		try (Scanner teclado = new Scanner(System.in); Connection con = UtilData.connect()) {
			
			String sql = "SELECT * FROM car WHERE id_car = ?";
			
			PreparedStatement prepSt = con.prepareStatement(sql);
			
			System.out.println("Type the car id to search for its data");
			int id = teclado.nextInt();
			teclado.nextLine();
			prepSt.setInt(1, id);
			
			ResultSet rs = prepSt.executeQuery();
			
			while(rs.next())	{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
				System.out.println("---------");
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		}

	}

}
