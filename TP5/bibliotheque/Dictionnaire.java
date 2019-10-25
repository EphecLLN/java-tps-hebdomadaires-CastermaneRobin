package bibliotheque;

import java.util.Arrays;

public class Dictionnaire extends Livre{

	private String [][]dictPages;
	/**
	 * @param nomAuteur
	 * @param titre
	 * @param anneeEdition
	 * @param pages
	 */
	public Dictionnaire(String nomAuteur, String titre, int anneeEdition) {
		super(nomAuteur, titre, anneeEdition);
		this.dictPages = new String[100][10];
		// TODO Auto-generated constructor stub
	}

	
	
	//-------------------------GET & SET----------------------------//
	/**
	 * @return the pages
	 */
	public String getPages(int i) {
		boolean test = false;
		for(int j = 1; j <= this.dictPages[i].length; j++) {
			if(i == j) {
				test = true;
			}
		}
		if(test) {
			String chaineFinal = "";
			for(int k = 0; k < dictPages[i].length; k++) {
				chaineFinal += dictPages[i][k] + "\n";
			}
			return chaineFinal;
		}else {
			return null;
		}
	}
	public String setPages(int i, String [] p) {
		boolean test = false;
		for(int j = 1; j <= this.dictPages[i].length; j++) {
			if(i == j) {
				test = true;
			}
		}
		if(test) {
			String valeur = "";
			for(int j = 0; j < this.dictPages[i].length; j ++) {
				valeur += p[j];
				this.dictPages[i][j] = p[j];
			}
			return valeur;
		}
		return null;
	}
	public String[] setDictPages(int i, String [] p) {
		String[] valeurAvant = this.dictPages[i];
		this.dictPages[i] = p;
		return valeurAvant;
	}
	
	public String getFirstDefinition() {
		return this.dictPages[0][0];
	}
	
	public void extrait() {}
	
	public String getDefinition(int i, int j) {
		return this.dictPages[i][j];
	}
	public String setDefinition(int i, int j, String p) {
		String valeurAvant = this.dictPages[i][j];
		this.dictPages[i][j] = p;
		return valeurAvant;
	}
	
	//----------------------EQUALS hashCode----------------------------//
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.deepHashCode(dictPages);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dictionnaire other = (Dictionnaire) obj;
		if (!Arrays.deepEquals(dictPages, other.dictPages))
			return false;
		return true;
	}
	
	//--------------TO STRING----------------------------------//
	@Override
	public String toString() {
		return "Dictionnaire [nomAuteur=" + nomAuteur + ", titre=" + titre
				+ ", anneeEdition=" + anneeEdition + "]";
	}

	public static void main(String[] args) {
		
		Dictionnaire monLivre = new Dictionnaire("Robin", "LaRousse", 2019);
		
		String [] p = {"1","2","3","4","5","6","7","8","9","10"};
		monLivre.setPages(4, p);
		System.out.println(monLivre.getPages(4));

	}

	

}
