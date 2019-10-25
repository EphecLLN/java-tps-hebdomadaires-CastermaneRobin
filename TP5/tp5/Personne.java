package tp5;

/**
 * @author robin
 *
 */
public class Personne {
	
	protected String nom;
	protected String prenom;
	protected int registreNational;
	
	public Personne(String nom, String prenom, int registreNational) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.registreNational = registreNational;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}



	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	/**
	 * @return the registreNational
	 */
	public int getRegistreNational() {
		return registreNational;
	}



	/**
	 * @param registreNational the registreNational to set
	 */
	public void setRegistreNational(int registreNational) {
		this.registreNational = registreNational;
	}


	/**
	 *@param other : Objet à comparer
	 */
	public boolean equals(Object other) {
		if (other != null && other instanceof Personne) {
			Personne p = (Personne) other;
			return(this.registreNational == p.registreNational);
		}else {
			return false;
		}
	}
	
	

	/**
	 *@return le nom, le prenom et le registreNational d'un personne
	 */
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", registreNational=" + registreNational + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		

	}

}
