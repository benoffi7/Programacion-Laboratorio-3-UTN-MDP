/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

import java.util.Random;

/**
 *
 * @author Fede
 */
public class Password {

    private int longitud;
    private final String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
    private String contra;

    public Password() {
        this(8);
    }

    public Password(int nuevaLongtiud) {
        setLongitud(nuevaLongtiud);
        generarPassword();
    }

    private void setLongitud(int nuevaLongitud) {
        longitud = nuevaLongitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContra() {
        return contra;
    }

    private void generarPassword() {
        StringBuilder temporal = new StringBuilder();
        Random random = new Random(System.nanoTime());

        for (int i = 0; i < longitud; i++) {
            //nextInt devuelve un numero entre 0 y la longitud -1 (o exclusivo)
            temporal.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        contra = temporal.toString();
    }

    private boolean esMinuscula(char c) {
        boolean rta = false;
        /*Usando los valores de la tabla ascii
        int valorASCII = (int) c;
        if (valorASCII >= 97 && valorASCII <= 122) {*/
        if (c >= 'a' && c<='z'){
            rta = true;
        }
        return rta;
    }

    private boolean esMayuscula(char c) {
        boolean rta = false;
        /*Usando los valores de la tabla ascii
        int valorASCII = (int) c;
        if (valorASCII >= 65 && valorASCII <= 90) {*/
        if(c>='A' && c<= 'Z'){
            rta = true;
        }

        return rta;
    }

    private boolean esNumero(char c) {
        boolean rta = false;
        /*int valorASCII = (int) c;
        if (valorASCII >= 48 && valorASCII <= 57) {*/
        if (c>= '0' && c<='9'){
            rta = true;
        }
        return rta;
    }

    public boolean esFuerte() {
        boolean rta = false;
        //más de 2 mayúsculas, más de 1 minúscula y más de 5 números.
        int cantMayus = 0;
        int cantMinus = 0;
        int cantNumeros = 0;
        String pass = getContra();
        for (int i = 0; i < pass.length(); i++) {
            char caracter = pass.charAt(i);
            if (esMayuscula(caracter)) {
                cantMayus++;
            }
            if (esMinuscula(caracter)) {
                cantMinus++;
            }
            if (esNumero(caracter)) {
                cantNumeros++;
            }
        }
        
        //if (cantMayus >= 2 && cantMinus >= 1 && cantNumeros >= 5) {
        if(cantMayus >= 1 && cantMinus >= 1 && cantNumeros >= 1) {
            rta = true;
        }

        return rta;
    }    
}
