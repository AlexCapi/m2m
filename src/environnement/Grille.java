package environnement;

import java.util.ArrayList;

public class Grille {
	
	public int rows;
	public int columns;
	public int[][] grille;
	
	public Grille(int rows, int columns){
		this.rows= rows;
		this.columns= columns;
		this.grille = new int[rows][columns];
		initialise(this.grille);
	}
	
	public void initialise(int grille[][]){
        for(int a=0; a<rows; a++){
            for(int b=0; b<columns; b++){
                grille[a][b] = 0;
            }
        }
	}
	
}
