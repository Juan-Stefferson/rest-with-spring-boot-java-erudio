package br.com.erudio.restwithspringbootjavaerudio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedException extends  RuntimeException{
	
	public UnsupportedException(String ex){
		super(ex);
	}
}
