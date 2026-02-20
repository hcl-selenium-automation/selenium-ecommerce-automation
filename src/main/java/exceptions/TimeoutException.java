package exceptions;
@SuppressWarnings("serial")
public class TimeoutException extends RuntimeException{
	 public TimeoutException(String message) {
	        super(message);
	    }
}
