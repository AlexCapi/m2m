package agent;

import java.util.Random;

import environnement.Element;
import environnement.Grille;
import environnement.Minerai;

public class Chercheur extends Agent {

	public Chercheur(int x, int y) {
		super(x, y);
	}

	Random r = new Random();

	public void seDeplacerRandom() {

		Element e = isminerais();

		if (e.getClass() != null) {
			seDelacer(e.getPositionx(), e.getPositiony());
		} else {

			int myRandomNumber = 0;
			myRandomNumber = this.r.nextInt(1 - (-1) + 1) + (-1);
			seDelacer(this.getPositionx() + myRandomNumber, this.getPositiony()
					+ myRandomNumber);
		}
	}

	public Element isminerais() {

		Element e = null;
		Grille g = this.getGrille();

		if (g.getElementByPosition(this.getPositionx() + 1,this.getPositiony() + 1) != null) {
			if (g.isFree(this.getPositionx() + 1, this.getPositiony() + 1)) {
				e = g.getElementByPosition(this.getPositionx() + 1,this.getPositiony() + 1);
				if (e.getClass() == Minerai.class) 
				{
					return e;
				}
				 
			}
		} else if (g.getElementByPosition(this.getPositionx() + 1, this.getPositiony() - 1) != null) {
			if (g.isFree(this.getPositionx() + 1, this.getPositiony() - 1)) {
				e = g.getElementByPosition(this.getPositionx() + 1, this.getPositiony() - 1);
				if (e.getClass() == Minerai.class) 
				{
					return e;
				}
			}
		} else if (g.getElementByPosition(this.getPositionx() - 1, this.getPositiony() + 1) != null) {
			if (g.isFree(this.getPositionx() - 1, this.getPositiony() + 1)) {
				e = g.getElementByPosition(this.getPositionx() - 1, this.getPositiony() + 1);
				if (e.getClass() == Minerai.class) 
				{
					return e;
				}
			}
		} else if (g.getElementByPosition(this.getPositionx() - 1, this.getPositiony() - 1) != null) {
			if (g.isFree(this.getPositionx() - 1, this.getPositiony() - 1)) {
				e = g.getElementByPosition(this.getPositionx() - 1, this.getPositiony() - 1);
				if (e.getClass() == Minerai.class) 
				{
					return e;
				}
			}
		}

		return e = null;

	}
}
