package agent;

public class Ravitailleur extends Agent {
    public Ravitailleur(int x, int y) {
        super(x, y);
    }
    
    public void ravitailler(Agent agent) {
        this.seDeplacer(agent.getPositionx(), agent.getPositiony());
        agent.setEnergy(100);
        this.seDeplacer(this.getBase().getPositionx(), this.getBase().getPositiony());
    }
}
