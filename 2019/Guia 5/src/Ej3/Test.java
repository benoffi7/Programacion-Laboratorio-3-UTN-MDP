/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

import java.util.Scanner;

/**
 *
 * @author Fede
 */
public class Test {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo");
        int dimension = teclado.nextInt();
        
        //System.out.println("Ingrese la longitud del password");
        int longitud = 10;
                //teclado.nextInt();
        
        Password [] contrasenias = new Password [dimension];
        boolean [] esFuerte = new boolean[dimension];
        
        for(int i = 0; i < contrasenias.length; i++){
            contrasenias[i] = new Password(longitud);
            esFuerte[i] = contrasenias[i].esFuerte();
            
            
            
            System.out.println("Contraseña: "+ contrasenias[i].getContra());
            System.out.print("Estado: ");
            //esFuerte esta modificado para que necesite 1 de cada uno para ser fuerte
            if(esFuerte[i]){
                System.out.println("Fuerte");
            }else{
                System.out.println("Debil");
            }
        }
        
        
    }
}
