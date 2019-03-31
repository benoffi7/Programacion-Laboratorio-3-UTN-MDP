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
public class BarajaEspañola50 extends BarajaEspañola{

   
    private final String NombreBaraja = "BarajaEspañolaDe50";

    public BarajaEspañola50() {
        super();
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < numeros.length; j++) {

                Mazo.add(BarajaEspañola[i][j]);

            }
        }
        for (int i = 0; i < 2; i++) {
            Carta comodin=new Carta("comodin",""+(i+1));
            Mazo.add(comodin);
        }
           //     mezclarCartas();

    }

    public String getNombreBaraja() {
        return NombreBaraja;
    }



   

    
  

   

  
}
