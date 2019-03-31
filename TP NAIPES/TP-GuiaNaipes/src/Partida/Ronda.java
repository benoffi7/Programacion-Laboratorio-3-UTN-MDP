/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Partida;

import BarajasEspañolas.BarajaEspañola50;
import BarajasInglesas.BarajaInglesa54;
import Cartas.Carta;
import Jugador.Jugador;
import java.util.ArrayList;

/**
 *
 * @author Facu
 */
public class Ronda {

    private BarajaEspañola50 Baraja_española ;
    private BarajaInglesa54 Baraja_inglesa;
    private ArrayList<Carta> Cartas_del_mazo;
    private int id;
    private static int cantidad_id;

    protected Ronda(String tipo_de_baraja) {
        id = (cantidad_id += 1);
        if (tipo_de_baraja.equals("BarajaEspañola")) {
            Baraja_española=new BarajaEspañola50();
            Cartas_del_mazo=Baraja_española.getMazo();
            
        }else if(tipo_de_baraja.equals("BarajaInglesa")){
             Baraja_inglesa=new BarajaInglesa54();
            Cartas_del_mazo=Baraja_inglesa.getMazo();
           
        }
    }

    public int getId() {
        return id;
    }

    protected void Jugar_ronda(ArrayList<Jugador> Jugadores_participando) {

      
        boolean carta_encontrada = false;
        int valor_de_carta_por_jugador[] = new int[Jugadores_participando.size()]; // en cada posicion le pongo los puntos por persona de cada posicion de jugadores_paticipando, 
     

        for (int i = 0; i < Jugadores_participando.size() ; i++) {
            for (int j = 0; j < Cartas_del_mazo.size() && carta_encontrada == false; j++) {
                if (Jugadores_participando.get(i).recibirUltimaCarta().compararCarta().equals(Cartas_del_mazo.get(j).compararCarta())) {
                    carta_encontrada = true;
                    valor_de_carta_por_jugador[i] = j;
                }
            }
            carta_encontrada = false;
        }
        
        int carta_mas_valorada=valor_de_carta_por_jugador[0];
        int posicion_persona_ganadora=0;
      
        for (int i = 1; i < valor_de_carta_por_jugador.length; i++) {
            if (valor_de_carta_por_jugador[i]>carta_mas_valorada) {
                carta_mas_valorada=valor_de_carta_por_jugador[i];
                posicion_persona_ganadora=i;
            }
        }
        Jugadores_participando.get(posicion_persona_ganadora).sumarPunto();
    }

}
