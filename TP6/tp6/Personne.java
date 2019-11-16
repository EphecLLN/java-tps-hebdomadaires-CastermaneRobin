/**
 * 
 */
package tp6;

import java.util.Date;

/**
 * @author robin
 *
 */
public abstract class Personne implements Affichable{

	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private Date dateArriveEtablissement;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 */
	public Personne(String nom, String prenom, Date dateDeNaissance, Date dateArriveEtablissement) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.dateArriveEtablissement = dateArriveEtablissement;
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
	 * @return the dateDeNaissance
	 */
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}



	/**
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}



	/**
	 * @return the dateArriveEtablissement
	 */
	public Date getDateArriveEtablissement() {
		return dateArriveEtablissement;
	}



	/**
	 * @param dateArriveEtablissement the dateArriveEtablissement to set
	 */
	public void setDateArriveEtablissement(Date dateArriveEtablissement) {
		this.dateArriveEtablissement = dateArriveEtablissement;
	}


	
	/**
	 * @return l'age d'une personne
	 */
	public int getAge() {
		Date ajd = new Date();
		
		if(ajd.getMonth() > this.getDateDeNaissance().getMonth()) {
			return (ajd.getYear() + 1900) - this.getDateDeNaissance().getYear();
		}
		if(ajd.getMonth() == this.getDateDeNaissance().getMonth()) {
			if(ajd.getDate() > this.getDateDeNaissance().getDate()) {
				return (ajd.getYear() + 1900) - this.getDateDeNaissance().getYear() - 1;	
			}
			else {
				return (ajd.getYear() + 1900) - this.getDateDeNaissance().getYear();	
			}
		}
		else {
			return (ajd.getYear() + 1900) - this.getDateDeNaissance().getYear() - 1;	
		}
	}
	
	
	public abstract int getAnciennete();
	public abstract String toString();
	
	public void affiche() {
		System.out.println(this.getClass().getSimpleName());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Personne p = new Etudiant("Robin", "Castermane", new Date(1990, 1, 27), new Date(2005, 10, 24));
		System.out.println(p.getAge());
		
	}

}
