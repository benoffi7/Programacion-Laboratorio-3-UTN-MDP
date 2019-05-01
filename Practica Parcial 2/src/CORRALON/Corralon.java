package CORRALON;

import java.util.ArrayList;

public class Corralon {
	
	private ArrayList<Empresa> listaEmpresa;
	private ArrayList<ConsumidorFinal> listaConsumidorFinal;
	private ArrayList<Producto> listaProducto;
	private ArrayList<Pedido>listaPedido;
	

	public Corralon() {
		listaEmpresa = new ArrayList<Empresa>();
		listaConsumidorFinal = new ArrayList<ConsumidorFinal>();
		listaProducto = new ArrayList<Producto>();
		listaPedido = new ArrayList<Pedido>();
	}
	
	
	public ArrayList<Empresa> getListaEmpresa() {
		return listaEmpresa;
	}


	public void setListaEmpresa(ArrayList<Empresa> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}


	public ArrayList<ConsumidorFinal> getListaConsumidorFinal() {
		return listaConsumidorFinal;
	}


	public void setListaConsumidorFinal(ArrayList<ConsumidorFinal> listaConsumidorFinal) {
		this.listaConsumidorFinal = listaConsumidorFinal;
	}


	public ArrayList<Producto> getListaProducto() {
		return listaProducto;
	}
	public void setListaProducto(ArrayList<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}
	
	
	
	public void agregarProducto(Producto p) {
		listaProducto.add(p);
	}

	public ArrayList<Pedido> getListaPedido() {
		return listaPedido;
	}


	public void setListaPedido(ArrayList<Pedido> listaPedido) {
		this.listaPedido = listaPedido;
	}

	public void agregarPedido(Pedido pedido1) {
		listaPedido.add(pedido1);
	}

	public void agregarCliente(Cliente c) {
		if(c instanceof Empresa ) {
			listaEmpresa.add((Empresa)c);
		}else if ( c instanceof ConsumidorFinal) {
			listaConsumidorFinal.add((ConsumidorFinal)c);
		}
	}
	
	public String mostrarListas() {
		String rta = " ";
		if(listaProducto != null) {
			for(Producto p : listaProducto) {
				rta = rta +p.toString();
			}
		}
		if(listaConsumidorFinal != null) {
			for(ConsumidorFinal cf : listaConsumidorFinal) {
				rta=rta+cf.toString();
			}
		} 
		if (listaEmpresa != null) {
			for(Empresa e : listaEmpresa) {
				rta=rta+e.toString();
			}
		}
		if(listaPedido!=null) {
			for(Pedido pedido : listaPedido) {
				rta=rta+pedido.toString();
			}
		}
		return rta;
	}
	
	public double calcularTotalBruto(Pedido dado) {
		double rta=0;
		Pedido aux = new Pedido();
		for(Pedido p : listaPedido) {
			aux=p;
			if(aux.equals(dado)) {
				for(Producto e : dado.getListaProducto()) {
					rta=rta+e.getPrecioUnitario()*dado.getCantidad();
				}
			}
		}
		return rta;
	}
	
	public double calcularTotalNeto(Pedido p1) {
		double rta=0;
		
		if(p1.getCliente() instanceof Empresa) {
			rta=calcularTotalBruto(p1)*Empresa.getDescuento();
		}else if(p1.getCliente() instanceof ConsumidorFinal){
			rta=calcularTotalBruto(p1)*ConsumidorFinal.getDescuento();
		}
		
		return rta;
	}
	
	@Override
	public String toString() {
		return "\n Corralon [ listaEmpresa=" + listaEmpresa + " listaConsumidorFinal=" + listaConsumidorFinal
				+ "\n listaProducto=" + listaProducto + "\n listaPedido="+listaPedido+"]";
	}

	
	
}
