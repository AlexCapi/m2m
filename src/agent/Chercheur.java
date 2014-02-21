package agent;

import java.util.Random;

import environnement.Element;
import environnement.Minerai;

public class Chercheur extends Agent {

	Random r = new Random();

	public Chercheur() {

	}

	public void seDeplacerRandom() {

		Element e = isminerais();

		if (e.getClass() == Minerai.class) {
			this.setPositionx(e.getPositionx());
			this.setPositiony(e.getPositiony());
		} else {
			int myRandomNumber = 0;
			myRandomNumber = this.r.nextInt(1 - (-1) + 1) + (-1);
			myRandomNumber = this.r.nextInt(1 - (-1) + 1) + (-1);

			if (this.grille.isFree(this.getPositionx() + myRandomNumber,
					this.getPositiony() + myRandomNumber)) {
				this.setPositionx(this.getPositionx() + myRandomNumber);
				this.setPositiony(this.getPositiony() + myRandomNumber);
			}
		}
	}

	public Element isminerais() {

		Element e = null;

		if (this.grille.getElementByPosition(this.getPositionx() + 1,
				this.getPositiony() + 1) != null) {
			if (this.grille.isFree(this.getPositionx() + 1,
					this.getPositiony() + 1)) {
				return this.grille.getElementByPosition(
						this.getPositionx() + 1, this.getPositiony() + 1);
			}
		} else if (this.grille.getElementByPosition(this.getPositionx() + 1,
				this.getPositiony() - 1) != null) {
			if (this.grille.isFree(this.getPositionx() + 1,
					this.getPositiony() - 1)) {
				return this.grille.getElementByPosition(
						this.getPositionx() + 1, this.getPositiony() - 1);
			}
		} else if (this.grille.getElementByPosition(this.getPositionx() - 1,
				this.getPositiony() + 1) != null) {
			if (this.grille.isFree(this.getPositionx() - 1,
					this.getPositiony() + 1)) {

				return this.grille.getElementByPosition(
						this.getPositionx() - 1, this.getPositiony() + 1);
			}
		} else if (this.grille.getElementByPosition(this.getPositionx() - 1,
				this.getPositiony() - 1) != null) {
			if (this.grille.isFree(this.getPositionx() - 1,
					this.getPositiony() - 1)) {

				return this.grille.getElementByPosition(
						this.getPositionx() - 1, this.getPositiony() - 1);
			}
		}

		return e;

	}
}
