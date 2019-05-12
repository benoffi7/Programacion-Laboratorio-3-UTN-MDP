package Clases;

public class Acomision extends Empleado
{
	private int clientesCaptados;
	private float montoXcliente;
	
	public Acomision()
	{
		super();
		setClientesCaptados(0);
		setMontoXcliente(0);
	}
	
	public Acomision (String dni, String nombre, String apellido, int añoIngreso, float salarioBase, int clientesCaptados, float montoXcliente)
	{
		super(dni, nombre, apellido, añoIngreso, 750);
		setClientesCaptados(clientesCaptados);
		setMontoXcliente(montoXcliente);
	}

	protected int getClientesCaptados()
	{
		return this.clientesCaptados;
	}
	
	protected void setClientesCaptados(int clientesCaptados)
	{
		this.clientesCaptados = clientesCaptados;
	}
	
	protected float getMontoXcliente()
	{
		return this.montoXcliente;
	}
	
	protected void setMontoXcliente (float montoXcliente)
	{
		this.montoXcliente = montoXcliente;
	}
	
	protected float obtenerSalario()
	{
		float rta = (float)((float)getMontoXcliente() * getClientesCaptados());
		if(rta < getSalarioBase()) rta = getSalarioBase();
		return rta;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", clientesCaptados=" + clientesCaptados + ", montoXcliente=" + montoXcliente + "]";
	}

}
