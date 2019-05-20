import java.util.stream.IntStream;

public class Ejercicio7 {


    public static void Menu() {

        int[] arreglo = IntStream.rangeClosed(1, 10).toArray();
        int suma = Ejercicio1.Sumar_Arreglo_Enteros(arreglo, 10);
        System.out.println("Suma de los elementos= " + suma);

    }
}
