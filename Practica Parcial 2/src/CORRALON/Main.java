package CORRALON;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new ConsumidorFinal(1,"Tomas","Esteban","10/05/1996","223123456","39.504.322");
		ConsumidorFinal c2 = new ConsumidorFinal(2,"Ivan","Graciarena","11/01/1995","2235765132","38.704.049");
		ConsumidorFinal c3 = new ConsumidorFinal(3,"Micaela","Graciarena","16/10/1993","223576532","32.304.049");
		ConsumidorFinal c4 = new ConsumidorFinal(4,"Joaquin","Rosello","17/03/1993","2234770469","32.990.933");
		
		
		Producto p1 = new Producto("A377","Galletita","Oreo",23.00,3000);
		Producto p2 = new Producto("A321","Cafe","La Virginia",55.00,1500);
		Producto p3 = new Producto("B387","Leche","La Serenisima",50.00,30000);
		Producto p4 = new Producto("C698","Banana","Macaco",7,10000);
		
		Corralon corralon = new Corralon();
		
		corralon.agregarCliente(c1);
		corralon.agregarCliente(c2);
		corralon.agregarCliente(c3);
		corralon.agregarCliente(c4);
		
		corralon.agregarProducto(p1);
		corralon.agregarProducto(p2);
		corralon.agregarProducto(p3);
		corralon.agregarProducto(p4);
		
		
		
		Pedido pedido1 = new Pedido(c1,"30/04/2019");
		corralon.agregarPedido(pedido1);
		pedido1.agregarProducto(p2,30);
		pedido1.agregarProducto(p3,15);
		
		double rta =corralon.calcularTotalBruto(pedido1);
		System.out.println(""+rta);
		System.out.println(corralon.mostrarListas());
		
		
		
	}

}
