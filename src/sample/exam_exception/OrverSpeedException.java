package sample.exam_exception;

public class OrverSpeedException extends Exception {

	private static final long serialVersionUID = 1L;

	public OrverSpeedException() {
	}

	public OrverSpeedException(String message) {
		super(message);
	}

	public OrverSpeedException(Throwable cause) {
		super(cause);
	}

	public OrverSpeedException(String message, Throwable cause) {
		super(message, cause);
	}

}
