package answer;

public class OperatorException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public OperatorException() {}

	public OperatorException(String message) {
		super(message);
	}
	
    public OperatorException(Throwable cause) {
        super(cause);
    }
    
    public OperatorException(String message, Throwable cause) {
        super(message, cause);
    }
	
}
