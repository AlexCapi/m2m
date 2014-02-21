package agent;

import java.awt.Color;

import environnement.Base;
import environnement.Element;
import environnement.Grille;


public class Agent extends Element implements Runnable{
    private int energy;
    private Grille grille;
    
   
    
    public Agent(int x, int y) {
        super(x, y);
    }

    public void seDeplacer(int positionX, int positionY){};
    
    public void appelerRavit(){}
    
    public Base getBase() {
        for(Element e : grille.getElementList()) {
            if(e instanceof Base){
                return (Base) e;
            }
        }
        return null;
    }
    
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    public void init(){}

    public void onReceive(){}
	
    @Override
    public void run() {}

    public void end(){}
    

}
