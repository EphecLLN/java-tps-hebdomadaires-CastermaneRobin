package tp5;

public class Independant  extends Personne{

	private String numeroTVA;
	
	

	/**
	 * @param nom
	 * @param prenom
	 * @param registreNational
	 */
	public Independant(String nom, String prenom, int registreNational, String numeroTVA) {
		super(nom, prenom, registreNational);
		this.numeroTVA = numeroTVA;
	}
	
	public boolean equals(Object other) {
		if(other != null && other instanceof Personne) {
			Independant i = (Independant) other;
			return(this.numeroTVA == i.numeroTVA);
		}else {
			return false;
		}
	}

	
	
	@Override
	public String toString() {
		return "Independant [TVA=" + numeroTVA + ", nom=" + nom + ", prenom=" + prenom + ", registreNational="
				+ registreNational + "]";
	}

	public static void main(String[] args) {
		
	}

}
