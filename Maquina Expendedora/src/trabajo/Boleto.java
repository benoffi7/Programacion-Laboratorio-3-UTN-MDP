package trabajo;

public class Boleto {
	//primera
	private int tipoDeBoleto;
	private int tipoDeDescuento;
	private float costeDeBoleto;
	private float descuentoDeBoleto;
	//segunda
	
	//tercera
	public Boleto(){
		setTipoDeBoleto(0);
		setTipoDeDescuento(0);
		setCosteDeBoleto(0);
		setDescuentoDeBoleto(0);
	}
	
	//cuarta
	public void setTipoDeBoleto(int tipoDeBoletoRecivido){
		tipoDeBoleto=tipoDeBoletoRecivido;
	}
	public void setTipoDeDescuento(int tipoDeDescuentoRecivido){
		tipoDeDescuento=tipoDeDescuentoRecivido;
	}
	public void setDescuentoDeBoleto(float DescuentoDeBoletoRecivido){
		descuentoDeBoleto=DescuentoDeBoletoRecivido;
	}
	public void setCosteDeBoleto (float CosteDeBoletoRecivido){
		costeDeBoleto=CosteDeBoletoRecivido;
	}
	public int getTipoDeDescuento(){
		return tipoDeDescuento;
	}
	public int getTipoDeBoleto(){
		return tipoDeBoleto;
	}
	public float getDescuentoDeBoleto(){
		return descuentoDeBoleto;
	}
	public float getCosteDeBoleto(){
		return costeDeBoleto;
	}
	//Quinta
	
	/*
	public boolean ingresarDetalles(int tipoDeDescuento, int tipoDeBoletoRecivido){
		boolean flag=true;
		switch (tipoDeDescuento){
		case 1:
			setTipoDeBoleto(tipoDeBoletoRecivido);
			setTipoDeDescuento(tipoDeDescuento);
			setDescuentoDeBoleto(1);
		break;
		case 2:
			setTipoDeBoleto(tipoDeBoletoRecivido);
			setTipoDeDescuento(tipoDeDescuento);
			setDescuentoDeBoleto((float)0.90);
		break;
		case 3:
			setTipoDeBoleto(tipoDeBoletoRecivido);
			setTipoDeDescuento(tipoDeDescuento);
			setDescuentoDeBoleto((float)0.825);
		break;
		case 4:
			setTipoDeBoleto(tipoDeBoletoRecivido);
			setTipoDeDescuento(tipoDeDescuento);
			setDescuentoDeBoleto((float)0.75);
		break;
		case 5:
			setTipoDeBoleto(tipoDeBoletoRecivido);
			setTipoDeDescuento(tipoDeDescuento);
			setDescuentoDeBoleto(0);
		break;
		default:
			flag=false;
		break;
		}
		return flag;
	}
	*/
}
