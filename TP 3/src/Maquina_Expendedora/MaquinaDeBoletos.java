package Maquina_Expendedora;

public class MaquinaDeBoletos {

	private Boleto tipo;
	private static int cantidadBoletos;
	private double total;
	// el saldo del cliente se lo paso por parametro en el metodo ingresardinero
	private boolean ESTADO;
	
	
	
	public MaquinaDeBoletos(Boleto tipo, double total, boolean eSTADO) {
		super();
		this.tipo = tipo;
		this.total = total;
		ESTADO = eSTADO;
	}
	
	public MaquinaDeBoletos() {
		tipo=null;
		cantidadBoletos=0;
		total=0;
		ESTADO=true;//quizas lo tenga que poner en true para que arranque.
	}
	
	public boolean Disponible() {
		if(isESTADO() && getTotal() <= 1000) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public double PrecioBoleto() {
		return getTipo().getPrecio();
	}

	public double ImprimirBoleto(Boleto tipo,Cliente c1) {
		
		double vuelto=0;
		if(tipo.getPrecio()<=c1.getSaldo()) {
			
			vuelto = c1.getSaldo()- tipo.getPrecio();
			total=total+c1.getSaldo();
			cantidadBoletos++;
	
		}else {
			total=total+c1.getSaldo();
			cantidadBoletos++;
		}
		
		return vuelto;
		
	}
	
	public double ObtenerTotal() {
		return getTotal();
	}
	
	
	
	public Boleto getTipo() {
		return tipo;
	}
	public void setTipo(Boleto tipo) {
		this.tipo = tipo;
	}
	public static int getCantidadBoletos() {
		return cantidadBoletos;
	}
	public static void setCantidadBoletos(int cantidadBoletos) {
		MaquinaDeBoletos.cantidadBoletos = cantidadBoletos;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public boolean isESTADO() {
		return ESTADO;
	}
	public void setESTADO(boolean eSTADO) {
		ESTADO = eSTADO;
	}
	
	
	
	public void Vaciar() {
		total=0;
	}

	public double DevolverVuelto(Cliente c1) {
		double vuelto = 0;
		vuelto = c1.getSaldo();
		return vuelto;
	}

	public void Extraer() {
		total=0;
		cantidadBoletos=0;
	}
	
	
	
}
