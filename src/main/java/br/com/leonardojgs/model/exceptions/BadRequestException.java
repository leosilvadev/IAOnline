package br.com.leonardojgs.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class BadRequestException extends IAOnlineException {

	private static final long serialVersionUID = -6837539199981507324L;

	public BadRequestException(String msg) {
		super(msg);
	}
	
}
