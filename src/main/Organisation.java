package main;

import environnement.*;
import agent.*;

public class Organisation {
	
	public static void main(String[] args){
		System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
		
		Grille grille = new Grille(20,20);
		
		Base base = new Base(1,1);
		grille.addElement(base);
		
		Ravitailleur r = new Ravitailleur(3,1);
		grille.addElement(r);
		
		//System.out.println(grille.getElementByPosition(1, 1));
		//System.out.println(grille.isFree(1, 11));
		//Agent agent1 = new Agent();
		//grille.addElement((Element) agent1);
	}
	
}
