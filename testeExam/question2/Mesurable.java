package question2;

public interface Mesurable {

	public void ajouterMesure(double mesure);
	public void supprimerDerniereMesure();
	public double calculerMoyenne(double valeurMin, double valeurMax);
	public void viderMesures();
}
