/**
 * Ejercicio_23
 */
public class Ejercicio_23 {

    public static String nombre;
    public static int edad;
    public static int salario;

    public static int calcSalario() {
        if (edad < 16) {
            throw new IllegalArgumentException("Candidatos menores de 16 no seran calculados");
        } else if (edad >= 19 && edad <= 50) {
            salario = salario + (salario * 5) / 100;
        } else if (edad > 50 && edad <= 60) {
            salario = salario + (salario * 10) / 100;
        } else if (edad > 60) {
            salario = salario + (salario * 15) / 100;
        }
        return salario;
    }
}