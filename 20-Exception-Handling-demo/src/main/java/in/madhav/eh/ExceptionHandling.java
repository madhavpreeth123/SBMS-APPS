package in.madhav.eh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.madhav.controller.MsgController;

@ControllerAdvice
public class ExceptionHandling {

	private Logger logger=LoggerFactory.getLogger(MsgController.class);

	@ExceptionHandler(value = Exception.class)
	public String exceptionHandler(Exception e) {
		String msg=e.getMessage();
		logger.error(msg);
		return "errorpage";
	}
}
