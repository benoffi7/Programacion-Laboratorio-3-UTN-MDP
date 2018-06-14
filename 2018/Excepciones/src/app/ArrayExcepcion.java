package app;

public class ArrayExcepcion extends NegativeArraySizeException {
	int n;
	
	public ArrayExcepcion() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayExcepcion(String msg)
	{
		
	}

	public ArrayExcepcion(String msg, int t) {
		super(msg);
		n = t;
	}

	public String informa() {
		return getMessage() + n;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}