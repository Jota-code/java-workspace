package com.ejercicioCocheCrud.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ejercicioCocheCrud.utils.UtilData;

public class List {

	public static void main(String[] args) {
		
		try (Connection con = UtilData.connect()) {
			PreparedStatement st = con.prepareStatement("SELECT * FROM car");
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next())	{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
				System.out.println("---------");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
