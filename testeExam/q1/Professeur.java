package q1;

/**
 * @author robin
 *
 */
public class Professeur extends Personne{

	private double tempsDeTravail;

	/**
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 * @param tempsDeTravail
	 */
	public Professeur(String nom, String prenom, String dateDeNaissance, double tempsDeTravail) throws BadArgumentException{
		super(nom, prenom, dateDeNaissance);
		if(tempsDeTravail < 0 || tempsDeTravail > 1) {
			throw new BadArgumentException("Temps de travail invalide: " + tempsDeTravail);
		}
		this.tempsDeTravail = tempsDeTravail;
	}

	/**
	 * @return the tempsDeTravail
	 */
	public double getTempsDeTravail() {
		return tempsDeTravail;
	}

	/**
	 * @param tempsDeTravail the tempsDeTravail to set
	 */
	public void setTempsDeTravail(double tempsDeTravail) {
		this.tempsDeTravail = tempsDeTravail;
	}

	@Override
	public String toString() {
		return super.toString() + ", tempsDeTravail=" + tempsDeTravail*100 + "]";
	}
}
