package in.madhav.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlingException {
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<ErrorInfo> handlingException(Exception ae){
		
		String msg=ae.getMessage();
		ErrorInfo ei=new ErrorInfo();
		ei.setCode("SBI00023");
		ei.setMsg(msg);
		ei.setWhen(LocalDateTime.now());
		return new ResponseEntity<>(ei,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handlingUserNotFoundException(UserNotFoundException ue){
		
		String msg=ue.getMessage();
		ErrorInfo ei=new ErrorInfo();
		ei.setCode("SBI00033");
		ei.setMsg(msg);
		ei.setWhen(LocalDateTime.now());
		return new ResponseEntity<>(ei,HttpStatus.BAD_REQUEST);
		
	}

}
