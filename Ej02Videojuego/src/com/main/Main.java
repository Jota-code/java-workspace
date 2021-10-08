package com.main;

import com.classes.*;
import com.classes.Character;

public class Main {

	public static void main(String[] args) {
		
		//TODO: FALTA TERMINAR EL MAIN CON UN BUCLE
		//QUE FINALICE CUANDO UNO DE LOS DOS 
		//PERSONAJES TENGAN HEALTH = 0
		
		Weapon sword,bow,spell;
		
		sword = new Sword("katana", 10);
		spell = new Spell("fire ball", 15);
		bow = new Bow("arco curvo", 30);
		
		Character warr = new Warrior("Connan", sword, 0, 0);
		Character warr2 = new Warrior("Connan", sword, 0, 0);
		Character c3 = new Wizard("AWda", spell, 20, 10);
		
		c3.attack(warr, spell);
		
		warr.attack(c3, bow);
		//c3.atacar(warr,sword);
		//System.out.println(warr.getHealth());
		
	}

}
