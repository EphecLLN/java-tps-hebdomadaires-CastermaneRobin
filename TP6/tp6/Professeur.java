/**
 * 
 */
package tp6;

import java.util.Date;

/**
 * @author robin
 *
 */
public class Professeur extends Personne{

	/**
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 */
	public Professeur(String nom, String prenom, Date dateDeNaissance, Date dateArriveEtablissement) throws DateArriveeInvalideException{
		super(nom, prenom, dateDeNaissance, dateArriveEtablissement);
	}
	
	/**@return l'ancienneté d'un professeur, à partir de 23 ans
	 *
	 */
	public int getAnciennete() {
		Date ajd = new Date();
		
		int anneeAjd = (ajd.getYear() + 1900);
		int anneeArriveEtablissement = (this.getDateArriveEtablissement().getYear());
		
		int ageLorsDeArriveEtablissement = anneeArriveEtablissement - this.getDateDeNaissance().getYear();
		
		if(ageLorsDeArriveEtablissement > 23) {
			return anneeAjd - anneeArriveEtablissement;
		}
		else {
			int ageManquant = 24 - ageLorsDeArriveEtablissement;
			if(anneeAjd - anneeArriveEtablissement - ageManquant >= 0) {
				return anneeAjd - anneeArriveEtablissement - ageManquant;
			}
			else {
				return 0;
			}
		}
		
	}
	
	/**
	 *@return le nom, le prénom, l'age et l'ancienneté d'un professeur
	 */
	public String toString() {
		return "[nom]: " + this.getNom() + "\t [prénom]: " + this.getPrenom()+
				"\t [Age]: " + this.getAge() + "\t [Ancienneté]: " + this.getAnciennete();
	}
	
}
