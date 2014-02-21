package agent;

import java.awt.Color;

public class Ravitailleur extends Agent {
	
	 public final Color color = Color.BLACK;
	 
    public Ravitailleur(int x, int y) {
        super(x, y);
    }
    
    public void ravitailler(Agent agent) {
        this.seDeplacer(agent.getPositionx(), agent.getPositiony());
        agent.setEnergy(100);
        this.seDeplacer(this.getBase().getPositionx(), this.getBase().getPositiony());
    }
}
