package tp5;


/**
 * Cette classe modélise une calculatrice simplifiée avec une valeur courante et trois opérations. 
 * @author vvandens
 *
 */
public class Calculatrice {

	private double valeurCourante; // Stocke la valeur affichée sur l'écran de la calculatrice
	
	//--------------------------CONSTRUCTEURS--------------------------------//
	/**
	 * @param valeurCourante
	 */
	public Calculatrice(double valeurCourante) {
		super();
		this.valeurCourante = valeurCourante;
	}
	/**
	 * 
	 */
	public Calculatrice() {
		this.valeurCourante = 10;
	}	
	
	
	//---------------------------GET et SET---------------------------------//
	/**
	 * @return la valeurCourante actuellement affichée sur la calculatrice
	 */
	public double getValeurCourante() {
		return valeurCourante;
	}
	/**
	 * @param valeurCourante la nouvelle valeur à afficher sur la calculatrice
	 */
	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}
	
	
	//---------------------------Méthodes----------------------------------//
	/**
	 * Additionne un nombre à la valeur courante
	 * @param n le nombre à ajouter à la valeur courante de la calculatrice
	 */
	public void ajoute(double n) {
		valeurCourante+=n;
	}
	/**
	 * Soustrait un nombre à la valeur courante
	 * @param n le nombre à soustraire à la valeur courante de la calculatrice
	 */
	public void soustrait(double n) {
		valeurCourante-=n;
	}
	/**
	 * Elève la valeur courante au carré
	 */
	public void carre() {
		valeurCourante*=valeurCourante;
	}
	
	
	
	//-----------------------Début   TP3----------------------------------------//
	/**
	* Cette méthode calcule le carré d’un nombre.
	* @param n : Un nombre entier quelconque
	* @return Un nombre >= 0, résultat de la multiplication de n par lui-même
	*/
	public int carre(int n){
		int valeurRetour = n * n;
	return valeurRetour;
	}
	
	/** 
	 * Cette méthode vérifie si un nombre est pair.
	 * @param n : un nombre entier quelconque
	 * @return true si le nombre est pair sinon false.
	 */
	public String NbrePair (int n){
		if(n % 2 == 0) {
			return "true";
		}
		else {
			return "false";
		}
	}
	
	/**
	 * Cette méthode calcule le périmètre d'un carré sur base de la longueur de son coté
	 * @param n : un nombre entier positif
	 * @return un nombre >=0, résultat de la multiplication de n par 4 (4 cotés).
	 */
	public int perimetreCarre(int n) {
	return 4 * n;	
	}
	
	/**
	 * Cette méthode vérifie si un caractère donné apparaît dans une chaîne de caractères.
	 * @param carac : un caractère.
	 * @param chaine : une chaine de caractère non vide.
	 * @return vrai si un caractère donné apparait dans une chaine de caractère sinon false.
	 */
	public String testCarac(char carac, String chaine) {
		String test = "false";
		for(int i = 0; i < chaine.length(); i++) {
			if(carac == chaine.charAt(i)) {
				test = "true";
				System.out.println(chaine.charAt(i));
			}
		}
		return test;
	}
	//-------------------------------FIN TP3-------------------------------------//
	
	
	/**
	 * Renvoie une représentation textuelle de la valeur affichée sur la calculatrice
	 */
	public String toString() {
		return "La calculatrice affiche la valeur " + getValeurCourante();
	}
	//-------------------------------Equals----------------------------------------//
	/**
	 *
	 */
	public boolean equals(Object other) {
	    if (other != null && other instanceof Calculatrice) {
	    	Calculatrice c = (Calculatrice) other;
	        return ((this.valeurCourante == c.valeurCourante));
	    } else {
	        return false;
	    }
	}
	
	//-------------------------------CompareTo-------------------------------------//
	/**
	 * @param c : valeurCourante de la Calculatrice comparé avec celle appelant la fonction
	 * @return -1 si la valeurCourante est plus petite, 1 si elle est plus grande, sinon 0.
	 */
	public int compareTo(Calculatrice c) {
		if(this.valeurCourante < c.valeurCourante) {
			return -1;
		}
		if(this.valeurCourante > c.valeurCourante) {
			return 1;
		}
		return 0;
	}
	//--------------------------------Main-----------------------------------------//
	/**
	 * Méthode main permettant de lancer un test rapide de la classe calculatrice.
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice myCalc;
		
		if(args.length==0) {
			myCalc = new Calculatrice();
		}
		else {
			myCalc = new Calculatrice(Double.parseDouble(args[0]));
		}
		System.out.println(myCalc);
		
		
		Calculatrice calc1 = new Calculatrice(3);
		Calculatrice calc2 = new Calculatrice(4);
		
		System.out.println(calc1.compareTo(calc2));
	}

}