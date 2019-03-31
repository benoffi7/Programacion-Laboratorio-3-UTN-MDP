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
public class BarajaEspañola40 extends BarajaEspañola {

    private final String NombreBaraja = "BarajaEspañolaDe40";

    public BarajaEspañola40() {
        super();
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (BarajaEspañola[i][j].getNumero() != "8" && BarajaEspañola[i][j].getNumero() != "9") {
                    Mazo.add(BarajaEspañola[i][j]);
                   
                }
            }
        }
        mezclarCartas();
    }

    public String getNombreBaraja() {
        return NombreBaraja;
    }

  

    
}
