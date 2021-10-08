package com.ejercicios.ejercicio1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Pensaba que no se podian hacer constructores en ningun lado 
		 * Por eso al principio esta asi estructurado el codigo
		 */
		
		
		ArrayList<Ram> ramList = new ArrayList<Ram>();
		Ram vram,ram,apuRam;
		MotherBoard mobo = new MotherBoard();
		Processor processor = new Processor();
		ArrayList<GraphicsCard> gpuList = new ArrayList<GraphicsCard>();
		GraphicsCard gpu1,gpu2,apu;
		ArrayList<Periferal> periferalList = new ArrayList<Periferal>();
		
		
		apuRam = new Ram();
		apuRam.setPrice(0);
		apuRam.setHz(2000);
		apuRam.setGeneration("GDDR6 APU RAM");
		
		vram = new Ram();
		vram.setPrice(0);
		vram.setHz(3000);
		vram.setGeneration("GDDR6X");
		
		ram = new Ram();
		ram.setPrice(60);
		ram.setHz(2400);
		ram.setGeneration("GDDR5");
		
		ramList.add(ram);
		ramList.add(ram);
		
		mobo.setPrice(200);
		mobo.setBrand("GIGABYTE");
		mobo.setModel("Z390");
		
		gpu1 = new GraphicsCard();
		gpu1.setPrice(800);
		gpu1.setBrand("NVIDIA");
		gpu1.setModelo("RTX 3060 Ti");
		gpu1.setRam(vram);
		
		gpu2 = new GraphicsCard();
		gpu2.setPrice(1200);
		gpu2.setBrand("NVIDIA");
		gpu2.setModelo("RTX 3080");
		gpu2.setRam(vram);
		
		gpuList.add(gpu1);
		gpuList.add(gpu2);
		
		
		apu = new GraphicsCard();
		apu.setPrice(0);
		apu.setBrand("Intel");
		apu.setModelo("Intel APU");
		apu.setRam(apuRam);
		
		
		processor.setPrice(300);
		processor.setBrand("Intel");
		processor.setHz(2500);
		processor.setApu(apu);
		
		
		Periferal mouse,keyBoard,joyStick;
		
		mouse = new Periferal(PeriferalType.MOUSE, 40, "Logitech");
		keyBoard = new Periferal(PeriferalType.KEYBOARD, 70, "Logitech");
		joyStick = new Periferal(PeriferalType.JOYSTICK, 70, "Sony");
		
		periferalList.add(mouse);
		periferalList.add(keyBoard);
		periferalList.add(joyStick);
		
		
		
		Computer computer1;
		
		computer1 = new Computer(2000, "GIGABYTE", ramList, processor, gpuList, periferalList, mobo);
		
		
		System.out.println(computer1);
		System.out.println(computer1.calculateComponentsPrice());
		

	}

}
