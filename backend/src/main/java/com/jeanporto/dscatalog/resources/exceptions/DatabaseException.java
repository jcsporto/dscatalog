package com.jeanporto.dscatalog.resources.exceptions;

import java.io.Serializable;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String msg) {
		super(msg);
	}
}
