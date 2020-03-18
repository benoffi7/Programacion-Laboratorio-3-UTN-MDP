package Guia3;

public class Cuenta {
	private float id;
	private float saldo;
	Cliente miCliente;
	
	private void setId(float id)
	{
		this.id=id;
	}
	private void setSaldo(float saldo)
	{
		this.saldo=saldo;
	}
	private void setCliente (Cliente miCliente)
	{
		this.miCliente=miCliente;
	}
	private float getId()
	{
		return id;
	}
	private float getSaldo()
	{
		return saldo;
	}
	private Cliente getMiCliente()
	{
		return miCliente;
	}
	public float retornoId()
	{
		return getId();
	}
	public float retornoSaldo()
	{
		return getSaldo();
	}
	public Cliente retornoMiCliente()
	{
		return getMiCliente();
	}
	
	public void modificarSaldo(float saldo)
	{
		setSaldo(saldo);
	}
		
	public Cuenta(float idCuenta,float saldo,Cliente miCliente)
	{
		setId(idCuenta);
		setSaldo(saldo);
		setCliente(miCliente);
	}
	
	public void depositar(float dineroADepositar)
	{
		setSaldo(getSaldo()+dineroADepositar);
	}
	
	public boolean verificarDineroSuficiente(float dineroAExtraer)
	{
		if ((getSaldo()-dineroAExtraer)>=(-2000))
			return true;
		else
			return false;
	}
	public void extraer(float dineroAExtraer)
	{
		setSaldo(getSaldo()-dineroAExtraer);
	}
	
	
	
	
	
	
	
	
	
	
	
}
