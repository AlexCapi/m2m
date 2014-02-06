package main;

import environnement.*;
import agent.*;

public class Organisation {
	
	public static void main(String[] args){
		
		Grille grille = new Grille(10,10);
		
		Base base = new Base(1,1);
		grille.addElement(base);
		
		System.out.println(grille.getElementByPosition(1, 1));
		System.out.println(grille.isFree(1, 1));
		//Agent agent1 = new Agent();
		//grille.addElement((Element) agent1);
	}
	
}
