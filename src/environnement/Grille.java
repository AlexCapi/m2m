package environnement;

import java.util.ArrayList;
import java.util.Iterator;

public class Grille {
	
	private int taille_x;
	private int taille_y;
	private ArrayList <Element> elementList;
	
	public Grille(int x, int y){
		this.setTaille_x(x);
		this.setTaille_y(y);
		this.elementList = new ArrayList<Element>();
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
	}
	
	public void deleteElement(Element element){
		this.elementList.remove(element);
	}
	
	public Element getElementByPosition(int pos_x, int pos_y){
		Iterator<Element> it = elementList.iterator();
		while (it.hasNext()) {
			if(it.next().getPositionx() == pos_x){
				if(it.next().getPositiony() == pos_y){
					return it.next();
				}
			}
		}
		return null;
	}
	
	public boolean isFree(int pos_x, int pos_y){
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
