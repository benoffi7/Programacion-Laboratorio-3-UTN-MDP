/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej6;

/**
 *
 * @author usuario
 */
public class Test {

    public static void main(String[] args) {
        float descMinorista = 0.25f;
        float descMayorista = 0.50f;
        Cliente c1 = new ClienteMayorista("pepe", "salta", "12-345678-9", descMayorista);
        
        Factura f = new Factura(1, "31-05-2019", c1);
        f.agregarVenta(3, "Amoladora 7'' ", 500);
        
        System.out.println(c1.toString());
        System.out.println("");
        System.out.println(f.toString());
    }
}
