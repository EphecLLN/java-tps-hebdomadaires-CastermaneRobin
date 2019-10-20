package tp4;

import java.util.Scanner;

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
	
	//-------------------------CONSTRUCTEURS---------------------------//
	
	public Date(int jour, int mois, int annee) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	public Date(String date) {
		super();
		this.jour = Integer.parseInt(date.charAt(0) + "" + date.charAt(1));
		this.mois = Integer.parseInt(date.charAt(3) + "" + date.charAt(4));
		this.annee = Integer.parseInt(date.charAt(6) + "" + date.charAt(7) + 
				"" + date.charAt(8) + "" + date.charAt(9));
	}

	//-------------------------GET & SET-----------------------------//
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


	//----------------------------METHODES------------------------------------//
	@Override
	public String toString() {
		return "Date [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
	}
	
	//-------------------------------Equals----------------------------------------//
	/**
	 *@return true si la date est identique (annee-mois-jour), false sinon.
	 */
	public boolean equals(Object other) {
	    if (other != null && other instanceof Date) {
	    	Date d = (Date) other;
	        return ((this.jour == d.jour) && (this.mois == d.mois) && (this.annee == d.annee));
	    } else {
	        return false;
	    }
	}
		
	//-------------------------------CompareTo-------------------------------------//
	/**
	 * @param d : date comparé avec la la 1ère date appellant la fonction.
	 * @return -1 si elle est plus petite, 1 si elle est plus grande, sinon 0.
	 */
	public int compareTo(Date d) {
		if(this.annee < d.annee) {
			return -1;
		}
		if(this.annee > d.annee) {
			return 1;
		}
		return 0;
	}
	//------------------------------MAIN-------------------------------------//
	/**
	 * La méthode main permet de tester la classe date en créant un objet 
	 * au départ des arguments de la ligne de commande.  Trois arguments sont attendus, sous forme d'entiers : 
	 * Le jour, le mois et l'année.  
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String [] args) {
		Date d = new Date(27, 02, 1999);
		Date d1 = new Date("27/02/1999");
		
		//Utilisation de la class Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir une Date (sous le format : JJ-MM-YYYY) : ");
		String nouvelleDate = sc.nextLine();
		Date d2 = new Date(nouvelleDate);
		System.out.println(d2);
		
	}
}





