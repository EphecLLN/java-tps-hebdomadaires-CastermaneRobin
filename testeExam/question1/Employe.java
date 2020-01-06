package question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Employe extends Personne implements Comparable<Employe>{

	private String matricule;
	private LocalDate dateEngagement;
	private double salaire;
	
	private static final DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
	
	/**
	 * @param name
	 * @param prenom
	 * @param matricule
	 * @param dateEngagement
	 * @param formatDate
	 */
	public Employe(String name, String prenom, String matricule, String dateEngagement, double salaire) {
		super(name, prenom);
		this.matricule = matricule;
		try {
			this.dateEngagement = formatDate.parse(dateEngagement, LocalDate::from);
		}catch(DateTimeParseException e) {
			System.err.println(e);
		}
		
		this.salaire = salaire;
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
	 * @return the dateEngagement
	 */
	public LocalDate getDateEngagement() {
		return dateEngagement;
	}

	/**
	 * @param dateEngagement the dateEngagement to set
	 */
	public void setDateEngagement(LocalDate dateEngagement) {
		this.dateEngagement = dateEngagement;
	}

	/**
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	/**
	 * @return un entier représentant le nombre de mois d'ancienneté
	 */
	public int getAnciennete() {
		return Period.between(this.getDateEngagement(), LocalDate.now()).getMonths();
	}

	@Override
	public String toString() {
		return super.toString() + ", Employe [matricule=" + matricule + ", dateEngagement=" + dateEngagement + ", salaire=" + salaire
				+ ", Ancienneté=" + getAnciennete() + "]";
	}

	@Override
	public int compareTo(Employe e) {
		return this.getMatricule().compareTo(e.getMatricule());
	}
}
