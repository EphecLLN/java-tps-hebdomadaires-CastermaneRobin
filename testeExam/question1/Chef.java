package question1;

public class Chef extends Employe{

	private double bonus;
	
	/**
	 * @param name
	 * @param prenom
	 * @param matricule
	 * @param dateEngagement
	 * @param salaire
	 * @param bonus
	 */
	public Chef(String name, String prenom, String matricule, String dateEngagement, double salaire, double bonus) 
	throws BadArgumentException{
		super(name, prenom, matricule, dateEngagement, salaire);
		if(bonus > 5 || bonus < 0) {
			throw new BadArgumentException("Mauvais argument, bonus= " + bonus);
		}
		this.bonus = bonus;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "Chef [bonus=" + this.getBonus()*100 + "]";
	}

}
