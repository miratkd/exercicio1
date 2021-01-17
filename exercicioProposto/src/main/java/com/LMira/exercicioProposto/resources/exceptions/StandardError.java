package com.LMira.exercicioProposto.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Instant timeStamp;
	private Integer status;
	private String error;
	private String errorBr;
	private String message;
	private String path;

	public StandardError() {
		
	}

	public StandardError(Instant timeStamp, Integer status, String error,String errorBr, String message, 
			String path) {
		super();
		this.timeStamp = timeStamp;
		this.status = status;
		this.error = error;
		this.errorBr = errorBr;
		this.message = message;
		this.path = path;
	}

	public Instant getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Instant timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorBr() {
		return errorBr;
	}

	public void setErrorBr(String errorBr) {
		this.errorBr = errorBr;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
