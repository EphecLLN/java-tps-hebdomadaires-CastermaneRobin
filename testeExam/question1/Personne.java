package question1;

/**
 * @author robin
 *
 */
public class Personne {
	
	private String name;
	private String prenom;
	
	/**
	 * @param name
	 * @param prenom
	 */
	public Personne(String name, String prenom) {
		super();
		this.name = name;
		this.prenom = prenom;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "\n     Personne [name=" + name + ", prenom=" + prenom + "]";
	}
	
	
}
