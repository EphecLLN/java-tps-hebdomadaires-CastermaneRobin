package q1;

/**
 * @author robin
 *
 */
public class BadArgumentException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadArgumentException() {
	}
	public BadArgumentException(String msg) {
		System.err.println(msg);
	}
}
