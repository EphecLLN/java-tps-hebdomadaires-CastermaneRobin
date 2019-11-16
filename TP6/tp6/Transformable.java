package tp6;

public interface Transformable extends Affichable  {
	public void deplace(int deltaX, int deltaY);
	public void agrandit(int facteur);
	public void affiche();
}
