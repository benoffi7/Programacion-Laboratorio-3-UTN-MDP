/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Partida;

import BarajasEspañolas.*;
import BarajasInglesas.*;
import Jugador.Jugador;
import static java.lang.Thread.sleep;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Batalla{

    private int id;
    private static int id_contador;
    private ArrayList<Jugador> Jugadores_participando = new ArrayList<Jugador>();
    private final Jugador Ganador = null;
    private int rondas_jugadas = 1;
    private static Scanner scan = new Scanner(System.in);
    private int cartas_repartidas = 0;

    public Batalla(){
        id = (id_contador += 1);
    }

    public void Ingresar_Jugadores() {
        String Nombre, Apellido;
        String cargar_jugador = "s";

        for (int i = 1; i < 7 && cargar_jugador.equals("s"); i++) {

            Jugador Player = null;
            System.out.println("Ingrese el nombre del participante numero: " + i);
            Nombre = scan.next();
            System.out.println("Ingrese el apellido del participante numero: " + i);
            Apellido = scan.next();
            Player = new Jugador(Nombre, Apellido);
            Jugadores_participando.add(Player);
            System.out.println(" ");

            System.out.println("--------- Participante Numero: " + i + " ingresado ----------");
            System.out.println(" ");

            if (i >= 2 && i < 6) {
                System.out.println("Desea cargar otro jugador? (s/n) ");
                cargar_jugador = scan.next();
            }
            if (i == 6) {
                System.out.println("---Ha ingresado el ultimo jugador a la batalla---");
                System.out.println(" ");
            }

        }

    }

    public void Batalla_De_Cartas() throws InterruptedException {
        int opcion_de_baraja;
        System.out.println(" ");
        Ingresar_Jugadores();
        System.out.println(" ");
        mostrarJugadores();
        System.out.println(" ");
        
        do {
            opcion_de_baraja = SeleccionarBaraja();
            switch (opcion_de_baraja) {
                case 1:
                    BarajaEspañola40 BarajaEspañolaDe40 = new BarajaEspañola40();
                    Ronda rondaEspañola40 = new Ronda(BarajaEspañolaDe40.getTipo_de_baraja());

                    for (int i = 0; cartas_repartidas < BarajaEspañolaDe40.getMazo().size(); i++) {
                        cartas_repartidas = BarajaEspañolaDe40.Repartir_Cartas(Jugadores_participando, cartas_repartidas);
                        rondaEspañola40.Jugar_ronda(Jugadores_participando);
                    }

                    break;
                case 2:
                    BarajaEspañola48 BarajaEspañolaDe48 = new BarajaEspañola48();
                    Ronda rondaEspañola48 = new Ronda(BarajaEspañolaDe48.getTipo_de_baraja());

                    for (int i = 0; cartas_repartidas < BarajaEspañolaDe48.getMazo().size(); i++) {
                        cartas_repartidas = BarajaEspañolaDe48.Repartir_Cartas(Jugadores_participando, cartas_repartidas);
                        rondaEspañola48.Jugar_ronda(Jugadores_participando);
                    }

                    break;
                case 3:
                    BarajaEspañola50 BarajaEspañolaDe50 = new BarajaEspañola50();
                    Ronda rondaEspañola50 = new Ronda(BarajaEspañolaDe50.getTipo_de_baraja());

                    for (int i = 0; cartas_repartidas < BarajaEspañolaDe50.getMazo().size(); i++) {
                        cartas_repartidas = BarajaEspañolaDe50.Repartir_Cartas(Jugadores_participando, cartas_repartidas);
                        rondaEspañola50.Jugar_ronda(Jugadores_participando);
                    }

                    break;
                case 4:
                    BarajaInglesa52 BarajaInglesaDe52 = new BarajaInglesa52();
                    Ronda rondaInglesa52 = new Ronda(BarajaInglesaDe52.getTipo_de_baraja());

                    for (int i = 0; cartas_repartidas < BarajaInglesaDe52.getMazo().size(); i++) {
                        cartas_repartidas = BarajaInglesaDe52.Repartir_Cartas(Jugadores_participando, cartas_repartidas);
                        rondaInglesa52.Jugar_ronda(Jugadores_participando);
                    }
                 

                    break;
                case 5:
                    BarajaInglesa54 BarajaInglesaDe54 = new BarajaInglesa54();
                    Ronda rondaInglesa54 = new Ronda(BarajaInglesaDe54.getTipo_de_baraja());
                    
                     for (int i = 0; cartas_repartidas < BarajaInglesaDe54.getMazo().size(); i++) {
                        cartas_repartidas = BarajaInglesaDe54.Repartir_Cartas(Jugadores_participando, cartas_repartidas);
                        rondaInglesa54.Jugar_ronda(Jugadores_participando);
                    }

                    break;
                case 6:

                    System.out.print("Saliendo del sistema");
                    sleep(700);
                    System.out.print(".");
                    sleep(700);
                    System.out.print(".");
                    sleep(700);
                    System.out.print(".");
                    break;

                default:
                    System.out.println("Ha ingresado un numero errado");
            }
        } while (opcion_de_baraja > 6 || opcion_de_baraja < 1);

    }

    public int getId() {
        return id;
    }

    private int SeleccionarBaraja() {
        int opcion_de_baraja;
        System.out.println("1) Baraja Española de 40 ( sin 8 , 9 y comodines ) ");
        System.out.println("2) Baraja Española de 48 ( sin comodines ) ");
        System.out.println("3) Baraja Española de 50 ( todas las cartas ) ");
        System.out.println("4) Baraja Inglesa de 52 ( sin comodines ) ");
        System.out.println("5) Baraja Inglesa de 54 ( todas las cartas ) ");
        System.out.println("6) Salir del sistema");
        opcion_de_baraja = scan.nextInt();
        return opcion_de_baraja;

    }

    public void mostrarJugadores() {
        System.out.println("Los jugadores que participan son: ");
        for (int i = 0; i < Jugadores_participando.size(); i++) {
            System.out.println("Jugador: " + Jugadores_participando.get(i).ToString());

        }

    }

    private void setGanador(Jugador Ganador) {
        Ganador = new Jugador(Ganador);
    }

    public String Resultado_Batalla() {
        return "El ganador de la batalla: " + id + " ha sido " + Ganador.getNombre() + " " + Ganador.getApellido();
    }

    /*private void Repartir_Cartas(BarajaEspañola40 baraja) {

        for (int i = 0; i < Jugadores_participando.size() && cartas_repartidas < baraja.getMazo().size(); i++) {

            Jugadores_participando.get(i).AñadirCartaAlMazo(baraja.getMazo().get(cartas_repartidas));
            cartas_repartidas++;
            if (cartas_repartidas == baraja.getMazo().size()) {
                System.out.println("Se han acabado las cartas");

            }

        }
    }

    private void Repartir_Cartas(BarajaEspañola48 baraja) {

        for (int i = 0; i < Jugadores_participando.size() && cartas_repartidas < baraja.getMazo().size(); i++) {

            Jugadores_participando.get(i).AñadirCartaAlMazo(baraja.getMazo().get(cartas_repartidas));
            cartas_repartidas++;

            if (cartas_repartidas == baraja.getMazo().size()) {
                System.out.println("Se han acabado las cartas");

            }

        }
    }

    private void Repartir_Cartas(BarajaEspañola50 baraja) {

        for (int i = 0; i < Jugadores_participando.size() && cartas_repartidas < baraja.getMazo().size(); i++) {

            Jugadores_participando.get(i).AñadirCartaAlMazo(baraja.getMazo().get(cartas_repartidas));
            cartas_repartidas++;

            if (cartas_repartidas == baraja.getMazo().size()) {
                System.out.println("Se han acabado las cartas");

            }

        }

    }*/
}
