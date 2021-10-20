package model.persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import model.entity.Computer;

public class ComputerDao {
	
	public static int printComputerInFile(Computer computer)	{
		
		try(FileWriter fl = new FileWriter(new File("computer.txt")))	{
			
			fl.write(computer.toString());
			fl.flush();
			return 1;
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
	}

}
