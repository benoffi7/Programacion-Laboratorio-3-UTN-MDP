/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarajasEspañolas;

import Cartas.Carta;
import Jugador.Jugador;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Facu
 */
public abstract class BarajaEspañola {
    protected Carta BarajaEspañola[][]=new Carta[4][12];
    protected ArrayList<Carta> Mazo = new ArrayList<Carta>();
    protected String palos[]={"copa","basto","oro","espada"};
    protected int numeros[]={1,2,3,4,5,6,7,8,9,10,11,12};
    protected String tipo_de_baraja="BarajaEspañola";
    
    protected BarajaEspañola(){
       
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                BarajaEspañola[i][j]=new Carta(palos[i],""+numeros[j]);
            }
        }
    }
        public void hola(){};
        
        
   public void mezclarCartas(){
        Collections.shuffle(Mazo);
    }

    public ArrayList<Carta> getMazo() {
        return Mazo;
    }

    public String getTipo_de_baraja() {
        return tipo_de_baraja;
    }
    
    
    public void mostrarCartas(){
        System.out.println("---El mazo contiene---");
        for (int i = 0; i < Mazo.size(); i++) {
            
            System.out.println(Mazo.get(i).ToString());
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
}
