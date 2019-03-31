/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarajasInglesas;


import Cartas.Carta;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Facu
 */
public class BarajaInglesa52 extends BarajaInglesa {
    private final String NombreBaraja = "BarajaInglesaDe52";

    public BarajaInglesa52() {
        super();
        for (int i = 0; i < Palos.length; i++) {
            for (int j = 0; j < Numeros.length; j++) {

                Mazo.add(BarajaInglesa[i][j]);

            }
        }
       
    }

    public String getNombreBaraja() {
        return NombreBaraja;
    }

  

}
