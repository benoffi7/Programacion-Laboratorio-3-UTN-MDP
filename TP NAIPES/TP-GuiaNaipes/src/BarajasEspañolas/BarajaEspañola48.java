/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarajasEspañolas;

import Cartas.Carta;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Facu
 */
public class BarajaEspañola48 extends BarajaEspañola {

    private final String NombreBaraja = "BarajaEspañolaDe48";

    public BarajaEspañola48() {
        super();
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < numeros.length; j++) {

                Mazo.add(BarajaEspañola[i][j]);

            }
        }
                mezclarCartas();

    }

    public String getNombreBaraja() {
        return NombreBaraja;
    }

    

   

}
