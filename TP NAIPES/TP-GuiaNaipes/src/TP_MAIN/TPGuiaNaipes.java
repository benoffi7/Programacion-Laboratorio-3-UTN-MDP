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
        // Pregunta: Metodo Ingresar_Jugadores en BATALLA.JAVA, es correcto o creo varias variables
        // Recordatorio: Para realizar la batalla creo un metodo comenzar batalla , como el de batalla de pokemon salu2
        // El nombre Baraja en BARAJAESPAÑOLA , tiene que ser final pero no me deja asignarlo en cada clase.
        // Hago la clase BATALLA QUE HERREDE DE RONDA?, PARA NO PODER QUE SE PUEDA CREAR UNA RONDA EN EL MAIN CON PUBLIC, SINO PROTECTED SOLO PARA BATALLA
        // Si retorno las cartas me retorna su direc de memoria, si retorno el string da bien, quiero comparar de una la carta mas que comparar el valor && palo
        //Cree el metodo comparar carta, Esta bien? Con equals me compara bien pero con == no
       /* BarajaEspañola50 a = new BarajaEspañola50();
        BarajaEspañola48 ab = new BarajaEspañola48();
        BarajaEspañola40 abc = new BarajaEspañola40();*/

        /* a.getMazo().get(2);
        Jugador asad=new Jugador("ffauc","matiu");
        Carta carta=new Carta("copa","3");
        asad.AñadirCartaAlMazo(carta);
        System.out.println(" soy la carta "+asad.recibirUltimaCarta().compararCarta());
        System.out.println(" soy la carta "+a.getMazo().get(2).compararCarta());
        if (asad.recibirUltimaCarta().compararCarta().equals(a.getMazo().get(2).compararCarta())){
            System.out.println("eaeaea");
        }*/
 /* int array[]=new int[6];
       array[0]=8;
       array[1]=10;
       array[2]=9;
       array[3]=32;
       array[4]=1;
       array[5]=30;
         int carta_mas_valorada=array[0];
        int posicion_persona_ganadora=0;
      
        for (int i = 1; i < array.length; i++) {
            if (array[i]>carta_mas_valorada) {
                carta_mas_valorada=array[i];
                posicion_persona_ganadora=i;
            }
        }
        
        System.out.println(" carta valorada "+carta_mas_valorada);
        System.out.println(" pos valorada "+posicion_persona_ganadora);*/
        
    Batalla batalla1=new Batalla();
    batalla1.Batalla_De_Cartas();
    
    }

}
