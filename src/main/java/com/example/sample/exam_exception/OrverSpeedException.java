package com.example.sample.exam_exception;

public class OrverSpeedException extends Exception {

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

	public OrverSpeedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
