package environnement;

import java.awt.Color;

public class Element {
	protected int positionx;
	protected int positiony;
	
	public final Color color = Color.RED;
	
	public Element(int positionx, int positiony) {
		this.positionx = positionx;
		this.positiony = positiony;
	}

	public int getPositionx() {
		return positionx;
	}
	
	public void setPositionx(int positionx) {
		this.positionx = positionx;
	}
	
	public int getPositiony() {
		return positiony;
	}
	
	public void setPositiony(int positiony) {
		this.positiony = positiony;
	}
}
