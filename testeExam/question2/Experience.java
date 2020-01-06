package question2;

import java.util.ArrayList;
import java.util.List;

public class Experience implements Mesurable{

	private List<Double> listMesure = new ArrayList<Double>();
	private final double min = 0;
	private final double max = 10;
	
	/**
	 * default constructor
	 */
	public Experience() {
		super();
	}

	/**
	 * @return the listMesure
	 */
	public List<Double> getListMesure() {
		return listMesure;
	}

	/**
	 * @param listMesure the listMesure to set
	 */
	public void setListMesure(List<Double> listMesure) {
		this.listMesure = listMesure;
	}

	/**
	 * @return the min
	 */
	public double getMin() {
		return min;
	}

	/**
	 * @return the max
	 */
	public double getMax() {
		return max;
	}

	@Override
	public void ajouterMesure(double mesure) {
		this.listMesure.add(mesure);		
	}

	@Override
	public void supprimerDerniereMesure() {
		this.listMesure.remove(this.listMesure.size()-1);
	}

	@Override
	public double calculerMoyenne(double valeurMin, double valeurMax) {
		int MesureValide = 0;
		double avg = 0;
		for(double d : listMesure) {
			if(d >= valeurMin && d <= valeurMax) {
				avg += d;
				MesureValide++;
			}
		}
		return avg/MesureValide;
	}

	@Override
	public void viderMesures() {
		this.listMesure.clear();
	}

	public String stringListMesurer() {
		String list = "";
		for(double d : listMesure) {
			list += d + "\n";
		}
		
		return list;
	}
	@Override
	public String toString() {
		return "Il y a " + listMesure.size() + " mesure(s) relevée(s):"
				+ "\n" + stringListMesurer()
				+ "Moyenne des mesures comprises entre: " + this.min + " et " + this.max + " --> " 
				+ (Math.round(calculerMoyenne(min, max) * 100) / 100 );
	}
}
