package com.heliverse.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptions {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myAnyExpHandler(Exception ex,WebRequest req){

		MyErrorDetails err = new MyErrorDetails();
		err.setLcdt(LocalDateTime.now());
		err.setMessage(ex.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(QuizeExceptions.class)
	public ResponseEntity<MyErrorDetails> QuizeExceptionHandler(QuizeExceptions ex,WebRequest req){

		MyErrorDetails err = new MyErrorDetails();
		err.setLcdt(LocalDateTime.now());
		err.setMessage(ex.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> Nohandler(NoHandlerFoundException ex,WebRequest req)  {

		MyErrorDetails err = new MyErrorDetails(ex.getMessage(), LocalDateTime.now(), req.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
						
	}	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> Nohandler(MethodArgumentNotValidException ex,WebRequest req)  {

		MyErrorDetails err = new MyErrorDetails(ex.getMessage(), LocalDateTime.now(), req.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
						
	}	
	
	

}
