package q1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * @author robin
 *
 */
public class Personne implements Comparable<Personne>{

	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	
	private static final DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	/**
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 */
	public Personne(String nom, String prenom, String dateDeNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		
		try {
			this.dateDeNaissance = formatDate.parse(dateDeNaissance, LocalDate::from); 
		}catch(DateTimeParseException e) {
			System.err.println("Mauvais format de date : dd/MM/yyyy !");
			this.dateDeNaissance = null;
		}
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
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	/**
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	@Override
	public int compareTo(Personne o) {
		if(this.getNom().compareTo(o.getNom()) == 0) {
			return this.getPrenom().compareTo(o.getPrenom());
		}
		return this.getNom().compareTo(o.getNom());
	}
	
	/**
	 * @return l'age de la personne
	 */
	public int age() {
		return Period.between(this.dateDeNaissance, LocalDate.now()).getYears();
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prénom=" + prenom + ", âge= " + this.age();
	}
}
