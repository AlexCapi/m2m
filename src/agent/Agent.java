package agent;

import environnement.Base;
import environnement.Element;
import environnement.Grille;


public class Agent extends Element implements Runnable{
    private int energy;
    protected Grille grille;
    //server side of the Agent to accept new communications with new agents
    private Incoming incoming = null;
    
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
