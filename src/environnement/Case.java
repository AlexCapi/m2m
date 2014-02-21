package environnement;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import agent.Chercheur;
import agent.Extracteur;
import agent.Ravitailleur;
import agent.Transporteur;

public class Case extends JPanel{

	public int xPos;
	public int yPos;
	
	
	public Case(int xPos,int yPos) {
		super();
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.xPos=xPos;this.yPos=yPos;
	}
	
	public void switchColor(Minerai el) {
		this.setBackground(el.color);
	}
	
	public void switchColor(Base el) {
		this.setBackground(el.color);
	}
	
	public void switchColor(Extracteur el) {
		this.setBackground(el.color);
	}
	public void switchColor(Chercheur el) {
		this.setBackground(el.color);
	}
	public void switchColor(Ravitailleur el) {
		this.setBackground(el.color);
	}
	
	public void switchColor(Transporteur el) {
		this.setBackground(el.color);
	}
	
	public void switchColor(Obstacle el) {
		this.setBackground(el.color);
	}
	
	

}
