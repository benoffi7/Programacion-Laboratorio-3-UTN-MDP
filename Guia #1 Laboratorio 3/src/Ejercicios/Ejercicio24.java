package Ejercicios;

public class Ejercicio24 {

	public static void calcularSalarioPorEdad(int edad, float salario, String nombre) {
		float salarioFinal = 0, aumento = 0;
		if ((edad >= 19) && (edad <= 50)) {
			aumento = (float) (salario * 0.05);
			salarioFinal = salario + aumento;
			System.out.println(nombre + ", su salario final es de: $" + salarioFinal);

		} else {
			if ((edad >= 51) && (edad <= 60)) {
				aumento = (float) (salario * 0.10);
				salarioFinal = salario + aumento;
				System.out.println(nombre + ", su salario final es de: $" + salarioFinal);

			} else {
				aumento = (float) (salario * 0.15);
				salarioFinal = salario + aumento;
				System.out.println(nombre + ", su salario final es de: $" + salarioFinal);

			}
		}

	}
}
