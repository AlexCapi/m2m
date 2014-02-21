package agent;

import environnement.Base;
import environnement.Element;
import environnement.Grille;

public class Agent extends Element {
    private int energy;
    private Grille grille;
    private String id;
    //server side of the Agent to accept new communications with new agents
    private Incoming incoming = null;
    
    public Agent(int x, int y) {
        super(x, y);
        
        //set the socket server for incoming messages
        this.incoming = new Incoming("4444");
        this.incoming.start();
        
        //if the agent id is Cartman, it initiates the protocol
        //with Kenny
        if (id.equals("Cartman")) {

                Outgoing outgoing = new Outgoing("localhost", "4444");
                outgoing.start();

        } //if
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
   
}
