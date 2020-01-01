package q1;

public class Etudiant extends Personne {
	
	private String matricule;
	private static int nbrEtudiants;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 * @param matricule
	 */
	public Etudiant(String nom, String prenom, String dateDeNaissance, String matricule) {
		super(nom, prenom, dateDeNaissance);
		this.matricule = matricule;
		nbrEtudiants ++;
	}

	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * @return the nbrEtudiants
	 */
	public static int getNbrEtudiants() {
		return nbrEtudiants;
	}

	/**
	 * @param nbrEtudiants the nbrEtudiants to set
	 */
	public static void setNbrEtudiants(int nbrEtudiants) {
		Etudiant.nbrEtudiants = nbrEtudiants;
	}

	@Override
	public String toString() {
		return super.toString() + ", matricule=" + matricule + "]";
	}
	
}
