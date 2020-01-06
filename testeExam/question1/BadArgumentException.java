package question1;

public class BadArgumentException extends Exception {

	public BadArgumentException (String msg) {
		System.err.println(msg);
	}
}
