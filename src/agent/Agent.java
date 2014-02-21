package agent;

import environnement.Base;
import environnement.Element;
import environnement.Grille;

public class Agent extends Element implements Runnable {
	private int energy;
	private Grille grille;

<<<<<<< HEAD
	public Agent(int x, int y) {
		super(x, y);
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

	public void init() {
	}

	public void onReceive() {
	}

	@Override
	public void run() {
	}

	public void end() {
	}
=======
public class Agent extends Element implements Runnable{
    private int energy;
    private Grille grille;
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
    
>>>>>>> e2e56ec730a2df8a2a3daa8ba379514a6ee90306

}
