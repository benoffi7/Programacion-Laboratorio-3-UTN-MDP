/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_MAIN;

import BarajasEspañolas.*;
import BarajasInglesas.*;
import Cartas.Carta;
import Jugador.Jugador;
import Partida.Batalla;
import static java.lang.Thread.sleep;
import java.util.ArrayList;

/**
 *
 * @author Facu
 */
public class TPGuiaNaipes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // Pregunta: El metodo MostrarCartas, INTERFAZE, CLASE ABSTRACTA, PARA IMPLEMENTARLA SOLO 1 VEZ  
        // Si retorno las cartas me retorna su direc de memoria, si retorno el string da bien, quiero comparar de una la carta mas que comparar el valor && palo
        //Cree el metodo comparar carta, Esta bien? Con equals me compara bien pero con == no
        
        Batalla batalla1 = new Batalla();
        batalla1.Batalla_De_Cartas();

    }

}
