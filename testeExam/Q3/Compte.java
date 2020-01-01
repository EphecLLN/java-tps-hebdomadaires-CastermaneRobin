package Q3;

public class Compte {
	
	private int solde = 500;

	/**
	 * 
	 */
	public Compte() {
		super();
	}

	/**
	 * @return the solde
	 */
	public int getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(int solde) {
		this.solde = solde;
	}

	public boolean retrait(int montant) {
		if(montant <= this.solde) {
			this.solde -= montant;
			return true;
		}
		else {
			return false;
		}
	}
}
