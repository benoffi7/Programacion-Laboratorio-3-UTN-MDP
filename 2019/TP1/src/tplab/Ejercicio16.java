/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplab;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejercicio16 {

    private static Scanner sc = new Scanner(System.in);
    private static Double area = null;
    private static Double radio = null;
    private static Double length = null;

    public static void setRadio() {
        System.out.println("Enter the radio");
        radio = sc.nextDouble();
    }

    public static void setLength() {
        length = (2 * Math.PI * radio);
    }

    public static void setArea() {
        area = (Math.PI * Math.pow(radio, 2));
    }
    
    public void showMeasures (){
        System.out.println("Radio : "+radio);
        System.out.println("Area: "+ area);
        System.out.println("Length: "+length);
        
        
    }
}
