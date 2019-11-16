package tp6;

public abstract class Shape implements Transformable{
	
	private int id; //numéro d'ordre de création
	private int absisse;
	private int ordonne;
	
	private static int nombreId;
	
	/**
	 * @param absisse
	 * @param ordonne
	 */
	public Shape(int absisse, int ordonne) {
		this.absisse = absisse;
		this.ordonne = ordonne;
		
		nombreId ++;
		
		this.id = nombreId;
	}

	public abstract double surface();
	public abstract double perimetre() ;
	
	/**
	 * @return le nom de la forme suivi de son identifiant;
	 */
	public String getNom() {
		return this.getClass().getSimpleName() + "-" + this.id;
	}
	/**
	 * @return chaine de caractère composé de quatre lignes : 
	 * le nom de la forme,
	 * son emplacement,
	 * son perimetre et
	 * sa surface.
	 * 
	 */
	public String toString() {
		String nomDeLaForme = this.getClass().getSimpleName();
		String sonEmplacement = this.absisse + ";" + this.ordonne;
		double perimetre = this.perimetre();
		double surface = this.surface();
		
		return "nom: " + nomDeLaForme + "\t son emplacement: " + sonEmplacement + "\t perimètre: " + perimetre + "\t surface: " + surface;
	}
	
	public void affiche() {
		System.out.println(this.getClass().getSimpleName());
	}
	public void deplace(int deltaX, int deltaY) {
		this.absisse = deltaX;
		this.ordonne = deltaY;
	}
	public void agrandit(int facteur) {
		this.absisse *= 2;
		this.ordonne *= 2;
	}
	public static void main(String[] args) {
		Shape monCarre = new Carre(3, 2, 5);
		Shape monCercle = new Cercle(3, 2, 5);
		System.out.println(monCarre);
		System.out.println(monCercle);	
	} 
}