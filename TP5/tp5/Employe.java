package tp5;

public class Employe extends Personne {

	private int salaire;
	private String employeur;
	
	

	public Employe(String nom, String prenom, int registreNational, int salaire, String employeur) {
		super(nom, prenom, registreNational);
		this.salaire = salaire;
		this.employeur = employeur;
	}
	
	public boolean equals(Object other) {
		if(other != null && other instanceof Employe) {
			Employe e = (Employe) other;
			return(this.employeur == e.employeur);
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Employe [salaire=" + salaire + ", employeur=" + employeur + ", nom=" + nom + ", prenom=" + prenom
				+ ", registreNational=" + registreNational + "]";
	}

	public static void main(String[] args) {
		Personne pers = new Personne("Jules", "Dupont", 12324);
		Personne emp = new Employe("Jules", "Dupont", 12324, 1500, "EPHEC");
		Personne ind = new Independant("Jules", "Dupont", 12324, "BE123456789");
		System.out.println(pers);
		System.out.println(emp);
		System.out.println(ind);

	}

}
