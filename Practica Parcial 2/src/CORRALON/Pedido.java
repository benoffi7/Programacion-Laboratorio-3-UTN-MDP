package CORRALON;

import java.util.ArrayList;

public class Pedido {
	
	private Cliente cliente;
	private ArrayList<Producto>listaProducto;
	private String fecha;
	private int cantidad;
	
	public Pedido() {
		cliente=null;
		listaProducto=null;
		fecha="";
		cantidad=0;
	}
	public Pedido(Cliente cliente, String fecha) {
		this.cliente = cliente;
		listaProducto =  new ArrayList<Producto>();
		this.fecha = fecha;
	}
	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Producto> getListaProducto() {
		return listaProducto;
	}
	public void setListaProducto(ArrayList<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void agregarProducto(Producto p,int cantidad) {
		setCantidad(cantidad);
		listaProducto.add(p);
	}
	
	



	@Override
	public String toString() {
		return "\n Pedido [cliente=" + cliente + ", listaProducto=" + listaProducto + ", fecha=" + fecha + ", cantidad="
				+ cantidad + "]";
	}
	
	
	
}
