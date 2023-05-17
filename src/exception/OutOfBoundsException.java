package exception;

public class OutOfBoundsException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public OutOfBoundsException() {
        super("O valor está fora do limite esperado.");
    }
}
