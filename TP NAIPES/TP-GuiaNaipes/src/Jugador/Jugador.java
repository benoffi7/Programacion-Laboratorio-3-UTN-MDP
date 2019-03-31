/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import Cartas.Carta;
import java.util.ArrayList;

/**
 *
 * @author Facu
 */
public class Jugador {

    private int id;
    private static int cantidad_id;
    private final String Nombre;
    private final String Apellido;
    private int puntos; 
    private ArrayList<Carta> Mazo_Cartas = new ArrayList<Carta>();

    public Jugador(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        id = (cantidad_id += 1);
    }

    public Jugador(Jugador Jugador_copia) {
        this.Nombre = Jugador_copia.getNombre();
        this.Apellido = Jugador_copia.getApellido();
    }
    
    public int getPuntos() {
        return puntos;
    }

    public void sumarPunto() {
        this.puntos+=1;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String ToString() {
        return "Soy el jugador numero: " + id + " llamado: " + Nombre + " " + Apellido + " y tengo " +puntos+ " puntos";
    }

    public void AñadirCartaAlMazo(Carta carta_a_añadir) {
        Mazo_Cartas.add(carta_a_añadir);
    }
    
    public void MostrarCartas() {
        for (int i = 0; i < Mazo_Cartas.size(); i++) {
            System.out.println(Mazo_Cartas.get(i).ToString());
        }
    }
    
    public Carta recibirUltimaCarta(){
        return Mazo_Cartas.get(Mazo_Cartas.size() - 1);
     }

}
