
public class Cuenta {

	private double saldo;
	private String nombreCuenta;

	public Cuenta() {
		nombreCuenta = " ";
		saldo = 0;
	}

	public Cuenta(String nombreCuentaR) {
		setNombreCuenta(nombreCuentaR);
		saldo = 0;
	}

	public Cuenta(String nombreCuentaR, double saldoR) {
		setNombreCuenta(nombreCuentaR);
		setSaldo(saldoR);
	}

	private String getNombreCuenta() {

		return nombreCuenta;
	}

	private void setNombreCuenta(String nombreCuentaR) {

		nombreCuenta = nombreCuentaR;

	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldoR) {
		saldo = saldoR;
	}

	public void ingresarDinero(double dineroI) {

		saldo += dineroI;
	}

	public boolean retirarDinero(double dineroI) {
		boolean flag = true;

		if (saldo >= dineroI) {
			saldo -= dineroI;
		} else {
			flag = false;
		}
		return flag;
	}
}
