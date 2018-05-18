package app;

public class ArrayExcepcion extends NegativeArraySizeException {
	int n;

	public ArrayExcepcion(String msg, int t) {
		super(msg);
		n = t;
	}

	public String informa() {
		return getMessage() + n;
	}
}