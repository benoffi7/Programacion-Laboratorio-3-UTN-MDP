/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarajasInglesas;

import Cartas.Carta;
import Jugador.Jugador;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Facu
 */
public abstract class BarajaInglesa {
    protected String Palos[]={"diamantes","corazones","tréboles","picas"};
    protected String Numeros[]={"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    protected Carta BarajaInglesa[][]=new Carta[4][14];
    protected ArrayList<Carta> Mazo = new ArrayList<Carta>();
        protected String tipo_de_baraja="BarajaInglesa";


    
    
    protected BarajaInglesa(){
        for (int i = 0; i < Palos.length; i++) {
            for (int j = 0; j < Numeros.length; j++) {
                BarajaInglesa[i][j]=new Carta(Palos[i],Numeros[j]);
            }
        }
    
    }
    
     public int Repartir_Cartas(ArrayList<Jugador> Jugadores_participando, int cartas_repartidas) {

        for (int i = 0; i < Jugadores_participando.size() && cartas_repartidas < Mazo.size(); i++) {

            Jugadores_participando.get(i).AñadirCartaAlMazo(Mazo.get(cartas_repartidas));
            cartas_repartidas++;
            if (cartas_repartidas == Mazo.size()) {
                System.out.println("Se han acabado las cartas");

            }

        }
        return cartas_repartidas;
    }

    public void MezclarCartas() {
        Collections.shuffle(Mazo);
    }

    public String getTipo_de_baraja() {
        return tipo_de_baraja;
    }

    public ArrayList<Carta> getMazo() {
        return Mazo;
    }

    public void MostrarCartas() {
        for (int i = 0; i < Mazo.size(); i++) {
            System.out.println(Mazo.get(i).ToString());
        }
    }
}
