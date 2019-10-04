package tp2;


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
	
	public Etudiant(String nom, String prenom, int matricule, Date dateNaissance) {
		super(); // facultatif 
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.dateNaissance = dateNaissance;
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
	
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + "]";
	}

	/*
	 * Méthode main qui crée un étudiant et initialise les variables d'instance au départ de la ligne de commande
	 * 
	 */
	public static void main(String[] args) {
		Etudiant etu = new Etudiant("Castermane", "Robin", 201674, new Date(27, 02, 1999));
		int anee2 = etu.dateNaissance.getAnnee();
		int age = 2019 - anee2;
		//System.out.println(age);
		
		//etu.dateNaissance.setJour(33);
		System.out.println(etu.dateNaissance.getJour());
	
		//System.out.println(etu.nom);
		//System.out.println(etu);
		etu.setPrenom("Victor");
		//System.out.println(etu.getPrenom());
		
	}

}
