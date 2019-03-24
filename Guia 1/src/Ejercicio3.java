public class Ejercicio3 {

    public static void Menu(){
        Mostrar_cantidad_numeros_primos(100);

    }

    public static void Mostrar_cantidad_numeros_primos(int cant){
        if(cant>0) {

            int num=2,i=1;
            boolean bandera = false;
            System.out.println("Numero primos:");
            while (i<=cant) {
                bandera = Comprobar_Primo(num);
                if (bandera) {
                    System.out.println("" + num);
                    i++;
                }
                num++;

            }
        }
        else{
            System.out.println("Ingrese una cantidad mayor a 0");
        }
    }
    public static boolean Comprobar_Primo(int num){

        int i=2;
        boolean bandera=true;

        while ((bandera) && (num!=i)){
            if(num%i==0){
                bandera=false;
            }
            i++;
        }
        return bandera;
    }
}

