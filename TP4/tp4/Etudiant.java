package tp4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import java.io.File;



/**
 * Classe permettant la représentation d'un étudiant
 * @author Virginie Van den Schrieck
 */
public class Etudiant {
	//Variables d'instance
	private String nom;
	private String prenom;
	private int matricule;
	//Cette variable d'instance est du type Date, disponible dans le même package
	private Date dateNaissance;
	private static int nbEtudiants;
	private int age;
	
	public Etudiant(String nom, String prenom, Date dateNaissance) {
		super(); // facultatif 
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = Integer.parseInt(2016 + "" + this.nbEtudiants);
		this.dateNaissance = dateNaissance;
		
		nbEtudiants ++;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public int getNbEtudiants() {
		return nbEtudiants;
	}
	
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + "]";
	}

	/**
	 *@return true si les Etudiants ont le même matricule, sinon false.
	 */
	public boolean equals(Object other) {
	    if (other != null && other instanceof Etudiant) {
	    	Etudiant e = (Etudiant) other;
	        return ((this.matricule == e.matricule));
	    } else {
	        return false;
	    }
	}
	
	/**
	 * @param e : Etudiant comparé avec celui qui appel la fonction
	 * @return 1 Si le 1er Etudiant est plus agé, -1 s'il est plus jeune,
	 * 		   0 s'ils ont le même âges.
	 */
	public int compareTo(Etudiant e) {
		if(this.dateNaissance.getAnnee() < e.dateNaissance.getAnnee()) {
			return 1;
		}
		if(this.dateNaissance.getAnnee() == (e.dateNaissance.getAnnee()) &&
				this.dateNaissance.getMois() < e.dateNaissance.getMois()) {
			return 1;
		}
		if(this.dateNaissance.getAnnee() == (e.dateNaissance.getAnnee()) &&
				this.dateNaissance.getMois() == e.dateNaissance.getMois() &&
				this.dateNaissance.getJour() < e.dateNaissance.getJour()) {
			return 1;
		}
		if(this.dateNaissance.getAnnee() == (e.dateNaissance.getAnnee()) &&
				this.dateNaissance.getMois() == e.dateNaissance.getMois() &&
				this.dateNaissance.getJour() == e.dateNaissance.getJour()) {
			return 0;
		}
		return -1;
	}
	
	/**
	 * Méthode qui calcule l'age de l'étudiant depuis sa date de naissance, et à l'aide de la date actuel.
	 * @return l'age de l'étudiant
	 */
	public int age() {
		LocalDateTime date1 = LocalDateTime.now();
		int age = date1.toLocalDate().getYear() - this.dateNaissance.getAnnee();
		
		//Je vérifie si son mois est plus grand que le mois actuel, si oui je lui enlève 1 an
		if(this.dateNaissance.getMois() > date1.toLocalDate().getMonthValue()) {
			age --;
		}
		return age;
	}
	
	/*
	 * Méthode main qui crée un étudiant et initialise les variables d'instance au départ de la ligne de commande
	 * 
	 */
	public static void main(String[] args) {
		Etudiant etu1 = new Etudiant("Castermane", "Robin", new Date(27, 02, 1999));
		Etudiant etu2 = new Etudiant("Castermane", "Florent", new Date(23, 03, 2000));

			}

}