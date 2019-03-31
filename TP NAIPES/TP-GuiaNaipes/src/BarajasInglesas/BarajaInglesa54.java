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
public class BarajaInglesa54 extends BarajaInglesa{
     
    private final String NombreBaraja = "BarajaInglesaDe54";

    public BarajaInglesa54() {
        super();
        for (int i = 0; i < Palos.length; i++) {
            for (int j = 0; j < Numeros.length; j++) {

                Mazo.add(BarajaInglesa[i][j]);

            }
        }
        for (int i = 0; i < 2; i++) {
            Carta comodin=new Carta("comodin",""+(i+1));
            Mazo.add(comodin);
        }
    }

    public String getNombreBaraja() {
        return NombreBaraja;
    }

   

}
