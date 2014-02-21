package agent;

import environnement.Element;
import environnement.Grille;

public abstract class Agent extends Element implements Runnable {
	private int energy;
	private Grille grille;

	public void seDeplacer() {
	};

	public void seDeplacerVers(int xB, int yB) {

		int[] tab_pt = new int[8];

		//tab_pt[0] = Math.sqrt(((xB-(this.positionx-1))^2 + (y_B-y_A)^2));

	}

	public void appelerRavit() {
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

}
