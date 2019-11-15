package bibliotheque;

import java.util.Arrays;

public class Livre {

	protected String nomAuteur;
	protected String titre;
	protected int anneeEdition;
	protected String [] pages;
		
	
	//----------------------CONSTRUCTEURS-----------------------//
	/**
	 * 
	 */
	public Livre(String nomAuteur, String titre, int anneeEdition) {
		super();
		setNomAuteur(nomAuteur);
		setTitre(titre);
		setAnneeEdition(anneeEdition);
		pages = new String[100];
	}
	
	public Livre(String nomAuteur, String titre, int anneeEdition, String pages[]) {
		super();
		setNomAuteur(nomAuteur);
		setTitre(titre);
		setAnneeEdition(anneeEdition);
		setPage(pages);
	}
	
	//---------------------GET & SET------------------------//
	/**
	 * @return the nomAuteur
	 */
	public String getNomAuteur() {
		return nomAuteur;
	}

	/**
	 * @param nomAuteur the nomAuteur to set
	 */
	public void setNomAuteur(String nomAuteur) {
		if(nomAuteur == "") {
			this.nomAuteur = "Auteur inconnu";
		}else {
			this.nomAuteur = nomAuteur;
		}
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		if(titre == "") {
			this.titre = "Titre inconnu";
		}else {
			this.titre = titre;
		}
	}

	/**
	 * @return the anneeEdition
	 */
	public int getAnneeEdition() {
		return anneeEdition;
	}

	/**
	 * @param anneeEdition the anneeEdition to set
	 */
	public void setAnneeEdition(int anneeEdition) {
		this.anneeEdition = anneeEdition;
	}
	
	
	/**
	 * @param pages the pages to set
	 */
	public void setPage(String[] pages) {
		this.pages = pages;
	}

	/**
	 * @param i
	 * @return
	 */
	public String getPage(int i) {
		if(i >= 0 && i < this.pages.length) {
			return this.pages[i];
		}
		else {
			return null;
		}
	}
	
	/**
	 * @param i
	 * @param p
	 * @return
	 */
	public String setPage(int i, String p) {
		if(i >= 0 && i < this.pages.length) {
			String valeur = this.pages[i];
			this.pages[i] = p;
			return valeur;	
		}
		else {
			return " ";
		}
	}
	
	
	
	public String getFirstPage() {
		return this.pages[0];
	}
	
	public String extrait() {
		return this.pages[0];
	}

	//----------------------EQUALS & hashCode-----------------------//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anneeEdition;
		result = prime * result + ((nomAuteur == null) ? 0 : nomAuteur.hashCode());
		result = prime * result + Arrays.hashCode(pages);
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Livre))
			return false;
		Livre other = (Livre) obj;
		if (anneeEdition != other.anneeEdition)
			return false;
		if (nomAuteur == null) {
			if (other.nomAuteur != null)
				return false;
		} else if (!nomAuteur.equals(other.nomAuteur))
			return false;
		if (!Arrays.equals(pages, other.pages))
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}
	
	//---------------------TOSTRING------------------------//
	@Override
	public String toString() {
		return "Livre [nomAuteur=" + nomAuteur + ", titre=" + titre + ", anneeEdition=" + anneeEdition + "]";
	}

	//-----------------------MAIN-------------------------//
	public static void main(String[] args) {
		Livre livre1 = new Livre("Robin","Le games", 2019);
		
		livre1.setNomAuteur("");
		System.out.println(livre1.nomAuteur);
		
		livre1.setPage(0, "Yolo");
		System.out.println(livre1.getPage(0));
	}

}
