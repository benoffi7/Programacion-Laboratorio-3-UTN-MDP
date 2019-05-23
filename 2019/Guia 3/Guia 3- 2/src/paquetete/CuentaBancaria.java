package paquetete;
import java.util.ArrayList;

public class CuentaBancaria 
{
	private int identificador;
	private int balance;
	private Cliente cliente;
	private ArrayList <String> registro;
	
	public CuentaBancaria () {
		setIdentificador(0);
		setBalance(0);
		setCliente(null);
		registro= new ArrayList <String>();
	}
	
	public CuentaBancaria (int identificadorR, int balanceR, Cliente clienteR) {
		setIdentificador(identificadorR);
		setBalance(balanceR);
		setCliente(clienteR);
		registro= new ArrayList <String>();
	}
	
	
	private int getIdentificador() {
		return identificador;
	}
	private void setIdentificador(int identificadorR) {
		identificador = identificadorR;
	}
	private int getBalance() {
		return balance;
	}
	private void setBalance(int balanceR) {
		balance = balanceR;
	}
	private Cliente getCliente() {
		return cliente;
	}
	private void setCliente(Cliente clienteR) {
		cliente = clienteR;
	}
	
	//sobreescritura toString//
	@Override
	public String toString() {
		return "\nIdentificador: " +getIdentificador()+ "\nCliente: " +getCliente().getNombre()+ "\nBalance: " + getBalance();
	}
	
	
	// Metodos del usuario //
	
	public String depositar (int depositoR) {
		balance = balance+depositoR;
		return "El deposito se ha realizado con exito. Su saldo actual es de: " +getBalance();
	}
	
	private boolean puedeExtraer (int extraccionR) {
		int rdo=0;
		rdo= getBalance()-extraccionR;
		if (rdo<0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String extraer (int extraccionR) {
		boolean verificacion= false;
		verificacion= puedeExtraer(extraccionR);
		if (verificacion==true) {
			balance= balance - extraccionR;
			return "La extraccion se ha realizado con exito. Su saldo actual es de: " + getBalance();
		}
		else {
			return "La cuenta no posee saldo suficiente para realizar esa extraccion.";
		}
	}
	
	//metodos arraylist//
	private int cantDeRegistros () {
		return registro.size();
	}
	
	//se presume que los depositos y extracciones ya fueron hechos, y con ellos sus debidas verificacciones//
	//se pasa por parametro los montos ya que al solo poder registrar 10, no sabemos cuales son los movimientos que desean registrar//
	public boolean agregarDepositoAlRegistro (int depositoR) {
		String mensaje= "El " +getCliente().getNombre()+ "deposito "+depositoR;
		if (cantDeRegistros()<10) {
			registro.add(mensaje);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean agregarExtraccionAlRegistro (int extraccionR) {
		String mensaje= "El " +getCliente().getNombre()+ "retiro "+extraccionR;
		if (cantDeRegistros()<10) {
			registro.add(mensaje);
			return true;
		}
		else {
			return false;
		}
	}
	
}
