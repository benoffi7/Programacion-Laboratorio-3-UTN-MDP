package app;

public class ClaveNoExisteExcecption extends Exception 
{
	private String clave; 
	public ClaveNoExisteExcecption(String msg, String clave)
	{
		super(msg);
		this.clave = clave;
	}
	
	public String getClave() {
		return clave;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage()+" vos ingresaste: "+getClave();
	}
}
