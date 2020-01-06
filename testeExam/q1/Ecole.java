/**
 * 
 */
package q1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author robin
 *
 */
public class Ecole {

	private String nom;
	private List<Cours> listCours = new ArrayList<Cours>();
	
	/**
	 * @param nom
	 * @param listCours
	 */
	public Ecole(String nom) {
		super();
		this.nom = nom;
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
	 * @return the listCours
	 */
	public List<Cours> getListCours() {
		return listCours;
	}

	/**
	 * @param listCours the listCours to set
	 */
	public void setListCours(List<Cours> listCours) {
		this.listCours = listCours;
	}
	
	/**
	 * @param cours, le cours ajout� � la liste des cours de l'�cole courante
	 */
	public void addCours(Cours cours) {
		this.listCours.add(cours);
	}
	
	public List<Etudiant> getEtudiants(String code){
		for(Cours cours : listCours) {
			if(cours.getCode().equals(code)) {
				return cours.getEtudiants();
			}
		}
		return null;
	}
	
	
	
	@Override
	public String toString() {
		return "Ecole [nom=" + nom + ", \n listCours=" + listCours + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ecole UCL = new Ecole("Ephec");
		
		Professeur prof1 = null;
		Professeur prof2 = null;
		try {
			prof1 = new Professeur("Van D", "Ivan", "29/11/1967", 0.8);
			prof2 = new Professeur("Van P", "Nathalie", "29/03/1970", 0.9);		
		} catch (BadArgumentException e) {
			e.printStackTrace();
		}
		
		Personne etu1 = new Etudiant("Castermane", "Robin", "27/02/1999", "HE201678");
		Personne etu2 = new Etudiant("Castermane", "Florent", "27/02/1999", "HE201674");
		Personne etu3 = new Etudiant("Castermane", "Robin", "27/02/1999", "HE201674");
		Personne etu4 = new Etudiant("Castermane", "Florent", "27/02/1999", "HE201674");
		
		Cours informatique = new Cours("Info2019", prof1);
		Cours reseau = new Cours("R�seau2019", prof2);
		
		informatique.addEtudiant((Etudiant)etu1);
		informatique.addEtudiant((Etudiant)etu4);
		reseau.addEtudiant((Etudiant)etu2);
		reseau.addEtudiant((Etudiant)etu3);
		
		UCL.addCours(informatique);
		UCL.addCours(reseau);
		
		System.out.println(etu1.compareTo(etu2));
		//System.out.println(UCL);
	}

}
