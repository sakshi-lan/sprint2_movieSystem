package com.cap.exception;

@SuppressWarnings("serial")
public class InvalidShowId extends Exception {
	public InvalidShowId(String errorMsg) {
		super(errorMsg);
	}
}
