package tp1;
public class Ejercicio4 {
    public static void cuarto(int dato){
        for(int numero = 2; numero <= dato ; numero++){
            int datoAnterior = numero-1;
            while((numero%datoAnterior) != 0){
                datoAnterior--;
            }
            if(datoAnterior == 1)
                System.out.println(numero);
        }
    }
}