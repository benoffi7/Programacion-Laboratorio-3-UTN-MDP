package tp1.guia1;

public class Ejercicio18 {
    public static void Temperaturas(){
        int[] mes = {29,35,34,32,29,32,26,24,20,26,23,31,34,15,21,23,19,27,32,19,26,23,10,29,37,29,17,30,21,22};
        int i =0;
        int x =0;
        int minimo =0;
        int max =0;
        int suma =0;
        float promedio =0;
        minimo = mes[i];

        while(i<30){
            if (minimo >= mes[i]) {
                minimo = mes[i];
            }
           if(mes[i] >= max){
                max = mes[i];
            }
            i++;
        }
        System.out.println("Temperatura minima del mes es de..." + minimo);

        System.out.println("Temperatura maxima del mes es de..." + max);

        while(x<30){
            suma = suma + mes[x];
            x++;
        }
        promedio = suma/i;
        System.out.println("Temperatura promedio del mes es de..." + promedio);

    }
}
