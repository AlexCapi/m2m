package agent;

import environnement.Element;
import environnement.Grille;

public abstract class Agent extends Element implements Runnable{
    private int energy;
    private Grille grille;

    public void seDeplacer(){};
    
    // Test 
    public void init(){

    }

    public void onReceive(){

    }
	
    @Override
    public void run() {

    }

    public void end(){

    }
	
}
