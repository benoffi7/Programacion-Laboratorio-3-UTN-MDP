package genericos_com2;

public class Inventario<E> 
{
	private E unElemento;
	private E otroElemento;
	
	public E getOtroElemento() {
		return otroElemento;
	}
	
	public E getUnElemento() {
		return unElemento;
	}
	
	public void setOtroElemento(E otroElemento) {
		this.otroElemento = otroElemento;
	}
	
	public void setUnElemento(E unElemento) {
		this.unElemento = unElemento;
	}

}
