package q1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author robin
 *
 */
public class Cours {

	private String code;
	private Professeur titulaire;
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
	
	/**
	 * @param code
	 * @param titulaire
	 * @param etudiants
	 */
	public Cours(String code, Professeur titulaire) {
		super();
		this.code = code;
		this.titulaire = titulaire;
	}
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the titulaire
	 */
	public Professeur getTitulaire() {
		return titulaire;
	}
	/**
	 * @param titulaire the titulaire to set
	 */
	public void setTitulaire(Professeur titulaire) {
		this.titulaire = titulaire;
	}
	/**
	 * @return the etudiants
	 */
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	/**
	 * @param etudiants the etudiants to set
	 */
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	/**
	 * @param etu, Etudiant ajouté à la liste du cours actuel
	 */
	public void addEtudiant(Etudiant etu) {
		etudiants.add(etu);
	}

	@Override
	public String toString() {
		return "\n \t Cours [code=" + code + ", \n \t\t titulaire=" + titulaire + ",\n \t\t\t etudiants=" + etudiants + "]";
	}
	
	
}
