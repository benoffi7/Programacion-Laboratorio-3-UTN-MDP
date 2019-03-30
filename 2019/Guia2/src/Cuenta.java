
public class Cuenta {
	private int nroCuenta;
	private String nombreUsuario;
	private float saldo;

	
	public Cuenta(int numero, String nombre, float saldoInicial) {
		setNroCuenta(numero);
		setNombreUsuario(nombre);
		setSaldo(saldoInicial);
	}

	public int getNroCuenta() {
		return nroCuenta;
	}

	private void setNroCuenta(int numero) {
		nroCuenta = numero;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	private void setNombreUsuario(String nombre) {
		nombreUsuario = nombre;
	}

	public float getSaldo() {
		return saldo;
	}

	private void setSaldo(float saldoNuevo) {
		saldo = saldoNuevo;
	}

	/**
	 * Metodo que aumentar el saldo de la cuenta en la cantidad de monto
	 * @param monto
	 */
	public void ingresar(float monto) {
		setSaldo( getSaldo() + monto);
	}
	
	
	/**
	 * Metodo que decrementara el saldo de la cuenta en la cantidad de monto
	 * @param monto
	 */
	public void extraer (float monto) {
		setSaldo( getSaldo() - monto);
	}
}
