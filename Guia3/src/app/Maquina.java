package app;

public class Maquina {

	static int cantidadBoletos=0;
	private int saldo;
	private static int limite = 60;
	private int recaudacion;
	private int vuelto;
	Boleto boleto;
	
	
    public Maquina() 
	{
		setSaldo(0);
		//setLimite(0);
		setRecaudacion(0);
		setBoleto(null);
		setVuelto(0);
	}
	
	public Maquina(int saldoN,int limiteN,int recaudacionN,Boleto boletoN,int vueltoN)
	{
		setSaldo(saldoN);
		//setLimite(limiteN);
		setRecaudacion(recaudacionN);
		setBoleto(boletoN);
		setVuelto(vueltoN);
	}
	
	public Maquina(Boleto boletoN) 
	{
		setSaldo(0);
		//setLimite(0);
		setRecaudacion(0);
		setBoleto(boletoN);
		setVuelto(0);
	}
	
	private void setSaldo(int saldoN)
	{
		saldo = saldoN;	  
	}
	
	private void setVuelto(int vueltoN)
	{
		vuelto=vueltoN;
	}
	
	public void setRecaudacion(int recaudacionN)
	{
		recaudacion = recaudacionN;
	}
		
	private void setBoleto(Boleto boletoN) 
	{
		boleto = boletoN;
	}
	
    private int getSaldo()
	{
		return saldo;	  
	}
	
    public int getVuelto() 
    {
    	return vuelto;
    }

	public int getRecaudacion()
	{
		return recaudacion;
	}
	
    public Boleto getBoleto()
    {
    	return boleto;
    }
    
    public void ingresarDinero(int dinero)
    {
        saldo+=dinero;
    }

    public int devolverDinero()
    {
    	int dinero = getSaldo();
    	saldo = 0;
    	return dinero;
    }
    
   /* public int darVuelto()
    {
    	if(getSaldo()>=devolverPrecio())
    	{
    	vuelto = getSaldo()-devolverPrecio();
    	recaudacion += getSaldo()-getVuelto();
    	saldo = 0;
    	}
    	return vuelto;
    }*/
    
    public void comprarBoleto()
    {
    	cantidadBoletos+=1;
    	vuelto = getSaldo()-devolverPrecio();
    	recaudacion += getSaldo()-getVuelto();
    	saldo = 0;
    }
    
    public int verSaldo()
    {
    	return getSaldo();
    }
    
 	public int devolverPrecio()
	{
		return(getBoleto().getPrecio());
	}  

 	public String devolverDescripcionBoleto()
 	{
 		return getBoleto().getDescripcion();
 	}

    
}

