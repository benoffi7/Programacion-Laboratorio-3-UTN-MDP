/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author Fede
 */
public class Test {

    public static void main(String[] args) {
        Electrodomestico[] productos = new Electrodomestico[10];
        productos[0] = new Lavadora();
        productos[1] = new Lavadora(105f, 30f);
        productos[7] = new Lavadora(20f, 150f, 40f, "Gris", 'C');
        productos[3] = new Lavadora(35f, 200f, 55f, "Pepe", 'A');
        productos[9] = new Television();
        productos[5] = new Television(300f, 50f);
        productos[6] = new Television(50, true, 500f, 30f, "ROJO", 'D');
        productos[2] = new Electrodomestico();
        productos[8] = new Electrodomestico(70f, 25f);
        productos[4] = new Electrodomestico(70f, 80f, "Naranja", 'B');

        float precio= 0f;
        for(Electrodomestico e: productos){
            if( e instanceof Electrodomestico){
                System.out.println("Electrodomestico "+e.precioFinal());
            }
            precio+=e.precioFinal();
        }
        for(Electrodomestico e: productos){
            if( e instanceof Lavadora){
                System.out.println("Lavadora "+e.precioFinal());
            }            
            precio+=e.precioFinal();
        }
        for(Electrodomestico e: productos){
            if( e instanceof Electrodomestico){
                System.out.println("Tele "+e.precioFinal());
            }            
            precio+=e.precioFinal();
        }
        System.out.println("Monto total "+precio);
    }
}
