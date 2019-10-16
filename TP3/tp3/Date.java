package tp3;

/**
 * Cette classe modélise une date de manière simplifiée.
 * @author Virginie Van den Schrieck
 *
 */
public class Date {
	
	//variables d'instance
	private int jour;
	private int mois;
	private int annee;
	
	
	
	public Date(int jour, int mois, int annee) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	
	/**
	 * @return the jour
	 */
	public int getJour() {
		return jour;
	}



	/**
	 * @param jour the jour to set
	 */
	public void setJour(int jour) {
		if(jour <= 31 && jour >=1) {
			this.jour = jour;
		}
		else {
			System.out.println("Date invalide");
		}
	}



	/**
	 * @return the mois
	 */
	public int getMois() {
		return mois;
	}



	/**
	 * @param mois the mois to set
	 */
	public void setMois(int mois) {
		this.mois = mois;
	}



	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}



	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}



	@Override
	public String toString() {
		return "Date [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
	}


	/**
	 * La méthode main permet de tester la classe date en créant un objet 
	 * au départ des arguments de la ligne de commande.  Trois arguments sont attendus, sous forme d'entiers : 
	 * Le jour, le mois et l'année.  
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String [] args) {
		Date d = new Date(27, 02, 1999);
		//d.setJour(20);
		System.out.println(d);
		
	}
}