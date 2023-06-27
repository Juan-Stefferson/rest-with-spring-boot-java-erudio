package br.com.erudio.restwithspringbootjavaerudio.exception.handler;

import br.com.erudio.restwithspringbootjavaerudio.exception.ExceptionResponse;
import br.com.erudio.restwithspringbootjavaerudio.exception.UnsupportedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
public class CustomazedHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public  final ResponseEntity<ExceptionResponse> handleAll(Exception ex, WebRequest request){
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UnsupportedException.class)
	public  final ResponseEntity<ExceptionResponse> handleMath(Exception ex, WebRequest request){
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
}
