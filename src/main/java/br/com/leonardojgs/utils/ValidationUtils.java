package br.com.leonardojgs.utils;

import org.springframework.validation.BindingResult;

import br.com.leonardojgs.model.exceptions.BadRequestException;

public class ValidationUtils {

	public static void validateRequest(BindingResult bindingResult){
		String message = bindingResult.getFieldError().getDefaultMessage();
		throw new BadRequestException(message);
	}
	
}
