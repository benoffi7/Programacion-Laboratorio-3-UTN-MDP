package app;

public class MiExcepcion extends Exception
{
	private int i;
	public MiExcepcion(String info, int i) {
		super(info);
		this.i = i;
		System.out.println("Constructor de la clase.");
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage()+" i : "+i;
	}
}
