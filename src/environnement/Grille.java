package environnement;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

import agent.Ravitailleur;

public class Grille {
	
	private int taille_x;
	private int taille_y;
	private ArrayList <Element> elementList;
	private JFrame frame;
/*
	
	public Grille(int rows, int columns){
		this.rows= rows;
		this.columns= columns;
		this.grille = new int[rows][columns];
		initialise(this.grille);
	}
	*/
	/*public void initialise(int grille[][]){
        for(int a=0; a<rows; a++){
            for(int b=0; b<columns; b++){
                //grille[a][b] = ;
            }
        }*/

	public Grille(int x, int y){
		this.setTaille_x(x);
		this.setTaille_y(y);
		this.elementList = new ArrayList<Element>();
		
		this.frame = new JFrame();
		frame.setSize(500, 600);
		frame.setTitle("Mars attack");
		
		GridLayout gridLayout = new GridLayout (x,y); 
		frame.setLayout(gridLayout);
		Border blackline = BorderFactory.createLineBorder(Color.black,1);
		for(int i = 0 ; i < x ; i++){
			for(int j = 0 ; j < y; j++){
			   Case ptest = new Case(i,j);
			   ptest.setBorder(blackline);
			   frame.getContentPane().add(ptest);
			}
		}
		
		frame.setVisible(true);
	}

	public int getTaille_x() {
		return taille_x;
	}

	public void setTaille_x(int taille_x) {
		this.taille_x = taille_x;
	}

	public int getTaille_y() {
		return taille_y;
	}

	public void setTaille_y(int taille_y) {
		this.taille_y = taille_y;
	}

	public ArrayList<Element> getElementList() {
		return elementList;
	}

	public void setElementList(ArrayList<Element> elementList) {
		this.elementList = elementList;
	}

	public void addElement(Element element) {	
		this.elementList.add(element);
		Case c = getCaseByPosition(element.getPositionx(),element.getPositiony());
		if(element != null){
			//Vérifier quel type d'Element est sur la case pour savoir si on peut y aller
			if(element instanceof Minerai){
				c.switchColor((Minerai)element);
			}else if(element instanceof Obstacle){
				c.switchColor((Obstacle)element);
			}else if(element instanceof Base){
				c.switchColor((Base)element);
			}else if(element instanceof Ravitailleur){
				c.switchColor((Ravitailleur)element);
			}
			
		}
	}
	
	public void deleteElement(Element element){
		this.elementList.remove(element);
	}
	
	public Case getCaseByPosition(int x,int y){
		for(int i = 0;i<this.frame.getContentPane().getComponentCount();i++){
			if(((Case)this.frame.getContentPane().getComponent(i)).xPos==x && ((Case)this.frame.getContentPane().getComponent(i)).yPos==y){
				return (Case)this.frame.getContentPane().getComponent(i);
			}
		}
		return null;
	}
	public Element getElementByPosition(int pos_x, int pos_y){
		for (Element e : elementList) {
			if(e != null){
				if(e.getPositionx() == pos_x){
					if(e.getPositiony() == pos_y){
						return e;
					}
				}
			}
		}
		return null;

	}
	
	public boolean isFree(int pos_x, int pos_y){
		if(pos_x > taille_x || pos_x < 0 || pos_y > taille_y || pos_y < 0){
			return false;
		}
		Element element = getElementByPosition(pos_x,pos_y);
		//Si il y a bien un élément à cette position sur la grille
		if(element != null){
			//Vérifier quel type d'Element est sur la case pour savoir si on peut y aller
			if(element instanceof Minerai){
				return true;
			}else if(element instanceof Obstacle){
				return false;
			}else if(element instanceof Base){
				return true;
			}
		}
		//Sinon c'est que la case est libre
		return true;
	}
}
