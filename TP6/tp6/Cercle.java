/**
 * 
 */
package tp6;

/**
 * @author robin
 *
 */
public class Cercle extends Shape{

	private double rayon;
	private String centre;
	
	/**
	 * @param absisse du centre du cercle
	 * @param ordonne du centre du cercle
	 */
	public Cercle(int absisse, int ordonne, double rayon) {
		super(absisse, ordonne);
		this.rayon = rayon;
		this.centre = absisse + ";" + ordonne;
	}

	/**
	 * @return les coordonnées du centre du cercle
	 */
	public String getCentre() {
		return this.centre;
	}
	/**
	 * @param absisse du centre du cercle
	 * @param ordonne du centre du cercle
	 */
	public void setCentre(int absisse, int ordonne) {
		this.centre = absisse + ";" + ordonne;
	}
	
	/**
	 *@return la surface du Cercle arrondi 2 chiffre après la virgule
	 */
	public double surface() {
		double surface = (Math.pow(this.rayon, 2.0) * Math.PI);
		double surfaceArrondi = arrondiNDecimales(surface, 2);
		
		return surfaceArrondi;
	}
	/**
	 *@return le perimetre du Cercle arrondi 2 chiffre après la virgule
	 */
	public double perimetre() {
		double perimetre = 2 * Math.PI * this.rayon;
		double perimetreArrondi = arrondiNDecimales(perimetre, 2);
		
		return perimetreArrondi;
	}
	
	/**
	 * @param x : double, nombre à arrondir
	 * @param n : int, nombre de chiffre après la virgule
	 * @return le nombre avec le nombre (n) de chiffre après la virgule
	 */
	private static double arrondiNDecimales(double x, int n) { 
		double pow = Math.pow(10, n); return (Math.floor(x * pow)) / pow; 
	}
}
