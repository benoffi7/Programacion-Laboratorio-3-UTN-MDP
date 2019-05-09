package aa;

public class main {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		System.out.println(empresa.agregarProducto(new ProductoFresco("1", "hoy", "2", "ayer", "aca")));
		System.out.println(empresa.contarCantidadPorTipo(1));
		System.out.println(empresa.toString());
		System.out.println(empresa.mostrarPorTipo(1));
		System.out.println(empresa.mostrarTodo());
		System.out.println(empresa.agregarProducto(new ProductoFresco("1", "hoy", "4444", "ayer", "aca")));
		
	}

}
