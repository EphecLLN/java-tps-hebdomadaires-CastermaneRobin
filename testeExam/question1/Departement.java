package question1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Departement {

	private String nom;
	private Chef chef;
	
	/*
	 * Utilisation d'une LinkedList ici car nous devons la parcourir pour trouver un Employé précis, et cela est plus
	 * rapide avec une LinkedList plus tôt qu'un ArrayList
	 */
	private List<Employe> listEmploye = new LinkedList<Employe>();
	
	private static int nombreDepartement;
	
	/**
	 * @param nom
	 * @param chef
	 */
	public Departement(String nom, Chef chef) {
		super();
		this.nom = nom;
		this.chef = chef;
		nombreDepartement ++;
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
	 * @return the chef
	 */
	public Chef getChef() {
		return chef;
	}

	/**
	 * @param chef the chef to set
	 */
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	/**
	 * @return the nombreDepartement
	 */
	public static int getNombreDepartement() {
		return nombreDepartement;
	}

	/**
	 * @param nombreDepartement the nombreDepartement to set
	 */
	public static void setNombreDepartement(int nombreDepartement) {
		Departement.nombreDepartement = nombreDepartement;
	}

	/**
	 * @return the listEmploye
	 */
	public List<Employe> getListEmploye() {
		return listEmploye;
	}

	/**
	 * @param listEmploye the listEmploye to set
	 */
	public void setListEmploye(List<Employe> listEmploye) {
		this.listEmploye = listEmploye;
	}
	
	/**
	 * @param matricule
	 * @return
	 */
	public Employe obtenirEmploye(String matricule) {
		Iterator<Employe> iterator = getListEmploye().iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getMatricule().equals(matricule)) {
				return iterator.next();
			}
		}
		return null;
	}
	
	/**
	 * @param e
	 */
	public void ajouterEmploye(Employe e) {
		this.listEmploye.add(e);
	}

	@Override
	public String toString() {
		return "\n Departement [nom=" + nom + " \n   chef=" + chef + "\n   listEmploye=" + listEmploye + "]";
	}	
}