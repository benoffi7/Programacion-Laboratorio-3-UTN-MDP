package ejercicios;

public class Ejercicio23 {
	public static void calcularSalarioFinal (String nombre, int edad, float salario) {
		float salarioFinal;
		if (edad<=0) {
			System.out.println("nace primero y espera a tener edad para trabajar");
		}else{
			if (edad<18) {
				System.out.println(nombre+" no tiene edad para trabajar");
			}else{
				if (edad<50) {
					salarioFinal= salario*(float)1.05;
					System.out.println("Buenos dias "+nombre+" su salario a cobrar es de: "+ String.format("%.2f", salarioFinal));
				}else{
					if (edad<60) {
						salarioFinal= salario*(float)1.10;
						System.out.println("Buenos dias "+nombre+" su salario a cobrar es de: "+ String.format("%.2f", salarioFinal));
					}else {
						salarioFinal= salario*(float)1.15;
						System.out.println("Buenos dias "+nombre+" su salario a cobrar es de: "+ String.format("%.2f", salarioFinal));
					}
				}
			}
		}
	}
}
