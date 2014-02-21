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
    
    public void seDelacer(int posx, int posy) {
            int sensX;
            int sensY;
            if (posx < this.positionx)
                    sensX = 1;
            else
                    sensX = 2;

            if (posy < this.positiony)
                    sensY = 1;
            else
                    sensY = 2;

            while (this.positionx != posx) {
                    if (this.energy != 0) {
                            if (sensX == 1) {
                                    if (this.getGrille().isFree(this.positionx - 1,
                                                    this.positiony)) {
                                            this.positionx--;

                                    } else {
                                            this.positiony++;
                                    }

                                    this.energy--;

                            }

                            else {

                                    if (this.getGrille().isFree(this.positionx + 1,
                                                    this.positiony)) {
                                            this.positionx++;
                                    } else {
                                            this.positiony++;
                                    }
                                    this.energy--;

                            }
                    } else {
                            // APeller ravit
                    }
            }

            while (this.positiony != posy) {
                    if (this.energy != 0) {
                            if (sensY == 1) {
                                    if (this.getGrille().isFree(this.positionx,
                                                    this.positiony - 1)) {
                                            this.positiony--;
                                    } else {
                                            this.positionx++;
                                    }
                                    this.energy--;

                            }

                            else {

                                    if (this.getGrille().isFree(this.positionx,
                                                    this.positiony + 1)) {
                                            this.positiony++;
                                    } else {
                                            this.positionx++;
                                    }
                                    this.energy--;

                            }
                    } else {
                            // appeller ravit
                    }
            }

    }

    public void appelerRavit() {
    }

	public Base getBase() {
		for (Element e : grille.getElementList()) {
			if (e instanceof Base) {
				return (Base) e;
			}
		}
		return null;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public Grille getGrille() {
		return grille;
	}

	public void setGrille(Grille grille) {
		this.grille = grille;
	}

}
