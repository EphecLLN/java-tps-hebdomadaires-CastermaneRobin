/**
 * 
 */
package tp6;

/**
 * @author robin
 *
 */
public class Point extends Shape{
	
	/**
	 * @param absisse
	 * @param ordonne
	 */
	public Point(int absisse, int ordonne) {
		super(absisse, ordonne);
		
	}
	
	/**
	 *@return la surface d'un point est null
	 */
	public double surface() {
		return 0;
	}
	/**@return le perimtre d'un point est null
	 *
	 */
	public double perimetre() {
		return 0;
	}
}
