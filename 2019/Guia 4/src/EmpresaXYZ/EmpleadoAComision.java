package EmpresaXYZ;

public class EmpleadoAComision extends Empleado
{
	private int nroClientes;
	private float montoPorCliente;
	private float salarioNeto;
	
	public EmpleadoAComision()
	{
		super();
		setNroClientes(0);
		setMontoPorCliente(0);
		salarioNeto = obtenerSalario();
	}
	

	public EmpleadoAComision(String nombre, String apellido, String dni, int año, float salarioBase, int clientes, float monto)
	{
		super(nombre, apellido, dni, año, salarioBase);
		setNroClientes(clientes);
		setMontoPorCliente(monto);
		salarioNeto = obtenerSalario();
	}
	
	
	//Setters
	public void setNroClientes(int nroClientes) 
	{
		this.nroClientes = nroClientes;
	}
	
	public void setMontoPorCliente(float montoPorCliente) 
	{
		this.montoPorCliente = montoPorCliente;
	}
	
	
	//Getters
	private int getNroClientes() 
	{
		return nroClientes;
	}
	
	private float getMontoPorCliente() 
	{
		return montoPorCliente;
	}
	
	private float getSalarioNeto()
	{
		return salarioNeto;
	}
	
	
	public float obtenerSalario()
	{
		//Arranca con 750
		float salarioFinal = getSalarioBase();
		
		float salarioPorComision = getNroClientes()*getMontoPorCliente();
		
		if(getSalarioBase() < salarioPorComision)
		{
			salarioFinal = salarioPorComision;
		}
		
		return salarioFinal;
	}
	
	public String toString()
	{
		return super.toString()+"\nSalario Neto por Empleado a Comision: " + getSalarioNeto();
				
	}
}
