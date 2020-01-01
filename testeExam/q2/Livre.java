/**
 * 
 */
package q2;

/**
 * @author robin
 *
 */
public class Livre {

	private String nom;
	private String auteur;
	
	/**
	 * contructeur par défaut
	 */
	public Livre() {}
	
	/**
	 * @param nom
	 * @param auteur
	 */
	public Livre(String nom, String auteur) {
		super();
		this.nom = nom;
		this.auteur = auteur;
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
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Livre: nom=" + nom + ", auteur=" + auteur;
	}
	
	
}
