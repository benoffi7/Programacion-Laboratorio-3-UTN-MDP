package e2;

public class Cuenta
{
	private int id;
	private float balance;
	private Cliente cliente;
	private float saldoDeudor = -2000;
	
	public Cuenta(int id, float balance, Cliente cliente)
	{
		setId(id);
		setBalance(balance);
		setCliente(cliente);
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setBalance(float balance)
	{
		this.balance = balance;
	}
	
	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
	public int getId()
	{
		return id;
	}
	
	public float getBalance()
	{
		return balance;
	}
	
	public Cliente getCliente()
	{
		return cliente;
	}
	
	public float getSaldoDeudor()
	{
		return saldoDeudor;
	}
	public void depositar(float montoADepositar)
	{
		setBalance(getBalance() + montoADepositar);
	}
	
	public boolean extraer(float montoAExtraer)
	{
		boolean resultado = false;
		float balanceFinal = getBalance() - montoAExtraer;
		if (balanceFinal >= getSaldoDeudor())
		{
			setBalance(getBalance() - montoAExtraer);
			resultado = true;
		}
		return resultado;
	}
	
	public String retornarNombreCliente()
	{
		return getCliente().getNombre();
	}
}
