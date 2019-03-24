package tp1;
public class Ejercicio3 {
    public static void tercero(){
        for(int numero = 2; numero <= 100 ; numero++){
            boolean flag = false;
            for(int i = 2;i <= numero / 2; i++){
                if(numero % i == 0)
                    flag = true;
            }
            if(!flag){
                System.out.println(numero);
            }
        }
    }
}