/**
 * 
 */
package tp6;

/**
 * @author robin
 *
 */
public class Carre extends Shape{

	private int longueur;
	private String pointInfGauche;
	
	/**
	 * @param absisse du coin inférieur gauche
	 * @param ordonne du coin inférieur gauche
	 * @param longueur la longueur du coté du carré
	 */
	public Carre(int absisse, int ordonne, int longueur) {
		super(absisse, ordonne);
		this.longueur = longueur;
		this.pointInfGauche = absisse + ";" + ordonne;
	}
	/**
	 * @return le point inférieur Gauche du carré
	 */
	public String getPointInfGauche() {
		return this.pointInfGauche;
	}
	/**
	 * @param absissedu coin inférieur gauche
	 * @param ordonne du coin inférieur gauche
	 */
	public void setPointInfGauche(int absisse, int ordonne) {
		this.pointInfGauche = absisse + ";" + ordonne;
	}
	/**
	 *@return la surface du carré
	 */
	public double surface() {
		return longueur * longueur;
	}
	/**
	 *@return le perimetre du carré
	 */
	public double perimetre() {
		return longueur * 4;
	}
}
