/**
 * 
 */
package tp6;

import java.util.Date;

/**
 * @author robin
 *
 */
public class Etudiant extends Personne{

	private String matricule;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 */
	public Etudiant(String nom, String prenom, Date dateDeNaissance, Date dateArriveEtablissement) {
		super(nom, prenom, dateDeNaissance, dateArriveEtablissement);
		this.matricule = this.getAnciennete() + "" + this.getNom().charAt(0) + this.getPrenom().charAt(0);
	}

	/**
	 *@return l'ancenneté d'un etudiant (année d'inscription)
	 */
	public int getAnciennete() {
		return this.getDateArriveEtablissement().getYear();
	}
	
	/**
	 * @return le Matricule de l'étudiant (année d'inscription + 1ère lettre du nom + 1ère lettre du prénom)
	 */
	public String getMatricule() {
		return matricule;
	}
	/**
	 *@return le nom, le prénom, l'age, lancienneté et le Matricule d'un étudiant
	 */
	public String toString() {
		
		return "[nom]: " + this.getNom() + "\t [prénom]: " + this.getPrenom() +
				"\t [Age]: " + this.getAge() + "\t [Ancienneté]: " + 
				this.getAnciennete() + "\t [Matricule]: " + this.getMatricule();
	}
	
}
