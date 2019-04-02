package app;
public class Main2 {
	
	/*
	Se pretende desarrollar una aplicación que simule el funcionamiento de un cajero automático.
	Primero se debe crear una clase llamada Cuenta, que administre las operaciones sobre la cuenta.
	Además del constructor y atributos que se estimen necesarios la clase contará
	con los métodos:

	void ingresar(float c). Agrega al saldo de la cuenta la cantidad recibida.
	
	void extraer(float c) Descuenta del saldo la cantidad recibida. Tras la llamada
 	a este método el saldo no podrá quedar en negativo.
 	
	float getSaldo(). Devuelve el saldo actual.
	
	Por otro lado, existirá una clase con el método main encargada de la captura y
	presentación de datos y administración de la cuenta. Al iniciarse la aplicación se 
 	mostrará el siguiente menú.
	
	1. Crear cuenta vacía
	2. Crear cuenta saldo inicial
	3. Ingresar dinero
	4. Sacar dinero
	5. Ver saldo
	6. Salir
	
	La opción 1 crea un objeto Cuenta con saldo 0, 
	la opción 2 solicita una cantidad y crea un objeto Cuenta con ese saldo inicial.
	
	En la opción 3 se solicita una cantidad y la ingresa en el objeto creado en las opciones
	1 y 2 (debe haber pasado antes por estas opciones), 
	
	mientras que la opción 4 se solicita una cantidad y la extrae del objeto creado en las opciones
 	1 o 2 (también debe haber pasado antes por estas opciones).
 	
	Finalmente, la opción 5 muestra el saldo,
	mientras que la 6 finaliza el programa, lo que provocará que el objeto Cuenta se destruya y se pierda el saldo.
	El menú vuelve a presentarse en pantalla mientras no se elija la opción de salir
	*/
	
	public static void main(String[] args) {
		
		Menu.OperarMenu();
	}
}
