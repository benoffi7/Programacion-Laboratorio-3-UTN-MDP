package paquetete;

public class Main {

	public static void main(String[] args) {
		
		//  A  //
		Cliente GonzaloBenoffi = new Cliente(1234, "Gonzalo", 'M');
		GonzaloBenoffi.toString();
		
		//  B  //
		CuentaBancaria cuentaDeBenoffi = new CuentaBancaria(234, 10000, GonzaloBenoffi);
		
		//  C  //
		cuentaDeBenoffi.depositar(450);
		cuentaDeBenoffi.extraer(400);
		cuentaDeBenoffi.extraer(45000);
		
		//  D  //
		CuentaBancariaVariante cuentaVarianteDeBenoffi = new CuentaBancariaVariante(1234, 10050, GonzaloBenoffi);
		cuentaVarianteDeBenoffi.depositar(50);
		cuentaVarianteDeBenoffi.extraer(11000);
		cuentaVarianteDeBenoffi.extraer(55000);
		
		//  E  //
		cuentaDeBenoffi.agregarDepositoAlRegistro(450);
		cuentaDeBenoffi.agregarExtraccionAlRegistro(400);
		
		cuentaVarianteDeBenoffi.agregarDepositoAlRegistro(50);
		cuentaVarianteDeBenoffi.agregarExtraccionAlRegistro(11000);

	}

}
