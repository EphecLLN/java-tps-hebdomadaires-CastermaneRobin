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
		setPages(pages);
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
		if(nomAuteur == null) {
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
		if(titre == null) {
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
	 * @return the pages
	 */
	public String[] getPages() {
		return pages;
	}

	/**
	 * @param i
	 * @return
	 */
	public String getPages(int i) {
		boolean test = false;
		for(int j = 1; j <= this.pages.length; j++) {
			if(i == j) {
				test = true;
			}
		}
		if(test) {
			return this.pages[i];
		}else {
			return null;
		}
	}
	
	/**
	 * @param pages the pages to set
	 */
	public void setPages(String[] pages) {
		this.pages = pages;
	}
	
	/**
	 * @param i
	 * @param p
	 * @return
	 */
	public String setPages(int i, String p) {
		boolean test = false;
		for(int j = 1; j <= this.pages.length; j++) {
			if(i == j) {
				test = true;
			}
		}
		if(test) {
			String valeur = this.pages[i];
			this.pages[i] = p;
			return valeur;
		}else {
			return "Erreur indice non conforme";
		}
	}
	
	public String getFirstPage() {
		return this.pages[0];
	}
	
	public void extrait() {}

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
		Livre l = new Livre("Robin", "Le games", 2019);
		
	

	}

}
