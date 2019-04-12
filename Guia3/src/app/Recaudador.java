package app;

public class Recaudador {

	Maquina maquinaE;
	private int totalRecaudado;
	
	public Recaudador()
	{
		setMaquinaE(null);
		setTotalRecaudado(0);
	}
	
	public Recaudador(Maquina maquinaN)
	{
		setMaquinaE(maquinaN);
		setTotalRecaudado(0);
		
	}
	
	public void setMaquinaE(Maquina maqN)
	{
		maquinaE = maqN;
	}
	
	public void setTotalRecaudado(int totalRecaudadoN)
	{
		totalRecaudado = totalRecaudadoN;
	}
	
	public Maquina getMaquinaE()
	{
		return maquinaE;
	}
	
	public int getTotalRecaudado()
	{
		return totalRecaudado;
	}
	
	public boolean abrirCaja()
	{
		if(verRecaudacionMaquina()==0)
		{
			return true;
		}else{
			return false;
		}
	}
	
	public int cerrarCaja()
	{		
		if(verRecaudacionMaquina()>0)
		{
			totalRecaudado = verRecaudacionMaquina();
			getMaquinaE().setRecaudacion(0);
		}	
		return totalRecaudado;
	}
	
	public void TotalRecaudado()
	{
		totalRecaudado += maquinaE.getRecaudacion();
	}

    public int verRecaudacionMaquina()
    {
    	return getMaquinaE().getRecaudacion();
    }
}
