package ana.cvetkovic.springboot.app.be.exception;

public class MyApplicationException extends Exception{

	private static final long serialVersionUID = 1L;

	public MyApplicationException(String messsage) {
		super(messsage);
	}
}
