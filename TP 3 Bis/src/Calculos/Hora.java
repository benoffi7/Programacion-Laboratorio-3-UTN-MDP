package Calculos;

import javax.xml.bind.ParseConversionEvent;

public class Hora {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora() {
		hora=0;
		minuto=0;
		segundo=0;
	}
	
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if(hora<24 && hora>=0) {
			this.hora = hora;	
		}
		
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if(minuto<=59 && minuto>=0) {
			this.minuto = minuto;
		}
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		if(segundo<=59 && segundo>=0) {
			this.segundo = segundo;
		}
	}
	public void incrementauno() {
		
	}


	public String muestraHora() {
		String aux1 = "0";
		String aux= String.valueOf(hora);
		String aux2=aux1+aux;
		if(hora<10) {
			return aux2;
		}else {
			return aux;
		}
	}
	
	public String muestraMinuto() {
		String aux1 = "0";
		String aux= String.valueOf(minuto);
		String aux2=aux1+aux;
		if(minuto<10) {
			return aux2;
		}else {
			return aux;
		}
	}
	
	public String muestraSeg() {
		String aux1 = "0";
		String aux= String.valueOf(segundo);
		String aux2=aux1+aux;
		if(segundo<10) {
			return aux2;
		}else {
			return aux;
		}
	}
	
	public String muestraTiempo() {
		return muestraHora()+":"+muestraMinuto()+":"+muestraSeg();
	}
}
