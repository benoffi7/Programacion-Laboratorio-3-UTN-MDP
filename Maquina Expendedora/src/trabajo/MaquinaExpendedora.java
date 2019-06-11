package trabajo;

public class MaquinaExpendedora {
	//primera
	private int cantidadDeBoletos;
	private	int boletosEmitidos;
	private float saldo;
	private	float recaudado;
	private	float saldoDeCaja;
	private Boleto boleto;
	//segunda
	
	//tercera
	public MaquinaExpendedora(){
		setCantidadDeBoletos(50);
		setBoletosEmitidos(0);
		setSaldo(0);
		setRecaudado(0);
		setSaldoDeCaja(100);
		boleto = new Boleto(); 
	}
	//cuarta
	public void setCantidadDeBoletos(int boletosRecividos){
		cantidadDeBoletos=boletosRecividos;
	}
	public int getCantidadDeBoletos(){
		return cantidadDeBoletos;
	}
	public void setBoletosEmitidos(int boletosEmitidosRecividos){
		boletosEmitidos=boletosEmitidosRecividos;
	}
	public int getBoletosEmitidos(){
		return boletosEmitidos;
	}
	public void setSaldo(float saldoRecivido){
		saldo=saldoRecivido;
	}
	public float getSaldo(){
		return saldo;
	}
	public void setRecaudado(float recaudadoRecivido){
		recaudado=recaudadoRecivido;
	}
	public float getRecaudado(){
		return recaudado;
	}
	public void setSaldoDeCaja(float saldoDeCajaRecivido){
		saldoDeCaja=saldoDeCajaRecivido;
	}
	public float getSaldoDeCaja(){
		return saldoDeCaja;
	}
	
	//quinta
	
}
