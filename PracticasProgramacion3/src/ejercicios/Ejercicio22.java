package ejercicios;
import java.math.*;

public class Ejercicio22 {
	public static void CalculadoraPolacaInversaApp (int numero1, int numero2, String operador) {
		double rta;
		switch (operador) {
		case "+":
			rta= numero1+numero2;
			System.out.println(numero1+"+"+numero2+"="+String.format("%.0f", rta));
		break;
		case "-":
			rta= numero1-numero2;
			System.out.println(numero1+"-"+numero2+"="+String.format("%.0f", rta));
		break;
		case "*":
			rta= numero1*numero2;
			System.out.println(numero1+"*"+numero2+"="+String.format("%.0f", rta));
		break;
		case "/":
			if (numero2!=0) {
				rta= numero1/numero2;
				System.out.println(numero1+"/"+numero2+"="+rta);
			}else{
				System.out.println("El divisor no puede ser 0");
			}
		break;
		case "^":
			if (!((numero1<0)&((numero2<0)&((numero2%2)!=0)))) {
			rta= Math.pow(numero1, numero2);
			System.out.println(numero1+"^"+numero2+"="+rta);
			}else{
				System.out.println("Error! No se contemplan los complejos");
			}
		break;
		case "%":
			if (numero2!=0) {
				rta = numero1%numero2;
				System.out.println(numero1+"%"+numero2+"="+rta);
			}else{
				System.out.println("El divisor no puede ser 0");
			}
		break;
		default:
			System.out.println("Error! operador incorrecto.");
		break;
		}
	}
}