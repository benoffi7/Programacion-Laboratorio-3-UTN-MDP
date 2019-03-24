/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.guia1;

import java.util.Arrays;
import java.util.Scanner;

import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio1 {

    public static void Cargar(int[] aCargar) {
        System.out.println("Cargue el arreglo...");
        scan = new Scanner(System.in);
        System.out.println("Ingrese datos...");
        int i = 0;
        while (i < 5) {
            aCargar[i] = scan.nextInt();
            i++;
        }
        System.out.println("Cargado exitosamente!!!");
        System.out.println("Arreglo... " + Arrays.toString(aCargar));
        scan.close();
    }

    public static int Suma(int[] aCargar) {
        int i = 0;
        int rta = 0;
        while (i < 5) {
            rta = rta + aCargar[i];
            i++;
        }

        System.out.println("Suma es... " + rta);
        return rta;
    }

    public static float Promedio(int[] aCargar) {
        int suma = Suma(aCargar);
        int promedio;

        promedio =suma/ 5 ;
        System.out.println("Promedio..." + promedio);
        return promedio;
    }
}
