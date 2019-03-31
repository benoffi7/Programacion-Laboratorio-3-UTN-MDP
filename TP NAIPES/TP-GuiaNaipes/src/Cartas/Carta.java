/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cartas;

/**
 *
 * @author Facu
 */
public class Carta {
    private final String palo;
    private final String numero;
   //Constructor
    public Carta(String palo_recibido, String numero_recibido){
        this.palo=palo_recibido;
        this.numero=numero_recibido;
    }
    
    //Constructor de copia
    public Carta(Carta carta_recibida){
            this.palo=carta_recibida.getPalo();
            this.numero=carta_recibida.getNumero();
            
    }

    public String getPalo() {
        return palo;
    }

    public String getNumero() {
        return numero;
    }
    
    public String compararCarta(){
        return palo+numero;
    }
    
    public String ToString(){
        return "La carta contiene el palo: "+palo+"-- Y su numero es: "+numero;
    }
    
}
