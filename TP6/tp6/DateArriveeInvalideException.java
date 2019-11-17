/**
 * 
 */
package tp6;

/**
 * @author robin
 *
 */
public class DateArriveeInvalideException extends Exception{
	
	public DateArriveeInvalideException() {
		super();
	}
	public DateArriveeInvalideException(String message) {
		System.err.println(message);
	}
}
