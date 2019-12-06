package exo2.model;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;

public class CodeCouleur {

	private List <Color> allColor;
	
	public CodeCouleur() {
		allColor = new ArrayList();
	}
	
	public Color getValue(Color c) {
		return c;
	}
	
	public List<Color> getColors(){
		return this.allColor;
	}
	
	public void addCouleur(Color c, int value) {
		
	}
	
	public Color calcule(Color dizaine, Color unite, Color puissance) {
		return dizaine;
	}
	
	
}
