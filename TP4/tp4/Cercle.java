package tp4;

/**
 * @author robin
 *
 */
public class Cercle {

	private double rayon;
	private double aire;
	private double perimetre;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public double aireCercle() {
		this.aire = this.rayon * this.rayon * Math.PI;
		return this.aire;
	}

	public double perimetreCercle() {
		this.perimetre = 2 * Math.PI * this.rayon;
		return this.perimetre;
	}
	
	//-------------------------------Equals----------------------------------------//
	/**
	 *
	 */
	public boolean equals(Object other) {
	    if (other != null && other instanceof Cercle) {
	    	Cercle c = (Cercle) other;
	        return ((this.rayon == c.rayon));
	    } else {
	        return false;
	    }
	}
	
	//-------------------------------CompareTo-------------------------------------//
	/**
	 * @param c : valeur du rayon du cerlce comparé avec celui appelant la fonction
	 * @return -1 si le rayon est plus petite, 1 si il est plus grande, sinon 0.
	 */
	public int compareTo(Cercle c) {
		if(this.rayon < c.rayon) {
			return -1;
		}
		if(this.rayon > c.rayon) {
			return 1;
		}
		return 0;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cercle c1 = new Cercle(14);
		System.out.println(c1.aireCercle());
		System.out.println(c1.perimetreCercle());
	}

}
