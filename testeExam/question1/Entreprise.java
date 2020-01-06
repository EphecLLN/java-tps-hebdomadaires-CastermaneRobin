package question1;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {

	private String nom;
	private List<Departement> listDepartement = new ArrayList<Departement>();
	
	/**
	 * @param nom
	 * @param listDepartement
	 */
	public Entreprise(String nom) {
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
	 * @return the listDepartement
	 */
	public List<Departement> getListDepartement() {
		return listDepartement;
	}

	/**
	 * @param listDepartement the listDepartement to set
	 */
	public void setListDepartement(List<Departement> listDepartement) {
		this.listDepartement = listDepartement;
	}
	
	/**
	 * @param d
	 */
	public void ajouterDepartement(Departement d) {
		this.listDepartement.add(d);
	}
	
	@Override
	public String toString() {
		return "Entreprise [nom=" + nom + ", listDepartement=" + listDepartement + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		
		Employe emp1 = new Employe("Castermane", "tutu", "HE201674", "10-01-2019", 3200);
		Employe emp2 = new Employe("Castermane", "titi", "HE201670", "10-01-2019", 3200);
		Employe emp3 = new Employe("Castermane", "toto", "HE201674", "10-01-2019", 3200);
		Employe emp4 = new Employe("Castermane", "tata", "HE201670", "10-01-2019", 3200);
		Chef chef1 = null;
		Chef chef2 = null;
		try {
			chef1 = new Chef("Castermane", "Robin", "HE201674", "10-01-2019", 3200, 2.0);
			chef2 = new Chef("Castermane", "Florent", "HE201674", "10-01-2019", 3200, 2.0);
		} catch (BadArgumentException e) {
			
		}
		Departement dep1 = new Departement("Pas-de-Calais", chef1);
		dep1.ajouterEmploye(emp1);
		dep1.ajouterEmploye(emp2);
		
		Departement dep2 = new Departement("Somme", chef2);
		dep2.ajouterEmploye(emp3);
		dep2.ajouterEmploye(emp4);
		
		Entreprise entreprise = new Entreprise("Axio");		
		entreprise.ajouterDepartement(dep1);
		entreprise.ajouterDepartement(dep2);
		
		System.out.println(entreprise);
	}
}









