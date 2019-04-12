
public class Maquina {

	private int saldo;
	private int limite;
	private int recaudacion;
	private String boleto;
	
	public Maquina() 
	{
		setSaldo(0);
		setRecaudacion(0);
		setBoleto("");
	}
	
	public Maquina(int saldoN,int recaudacionN, String boletoN)
	{
		setSaldo(saldoN);
		setRecaudacion(recaudacionN);
		setBoleto(boletoN);
	}
	
	public void setSaldo(int saldito)
	{
		saldo = saldito;	  
	}
	
	public int getSaldo()
	{
		return saldo;	  
	}
	
	public void setRecaudacion(int recaudacionN)
	{
		recaudacion = recaudacionN;
	}
	
	public int getRecaudacion()
	{
		return recaudacion;
	}
	
	public void setBoleto(String boletoN)
	{
		boleto = boletoN;
	}
	
	public String getBoleto()
	{
		return boleto;
	}
	
	public void setLimite(int limit)
	{
		limite = limit;	  
	}
	
	public int getLimite()
	{
		return limite;	  
	}
}
