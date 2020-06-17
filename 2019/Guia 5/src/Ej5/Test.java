/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej5;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Fede
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<Serie> pS = new ArrayList<>(5);
        ArrayList<VideoJuego> pV = new ArrayList<>(5);

        pS.add(new Serie());
        pS.add(new Serie(5, "WarnerBros"));
        pS.add(new Serie(2, "Cifonr", "Los Copiadores", "Policial"));
        pS.add(new Serie(3,"HBO","Juego de Sillas","Fantasia"));
        pS.add(new Serie());
        
        pS.get(1).entregar();
        
        pV.add(new VideoJuego());
        pV.add(new VideoJuego(80, "Square Enix"));
        pV.add(new VideoJuego(120,"Konami","Castlevania","Accion"));
        
        pV.get(2).entregar();
        
        Serie s = Collections.max(pS);
        System.out.println(s.toString());
        
        VideoJuego v = Collections.max(pV);
        System.out.println(v.toString());
    }
}