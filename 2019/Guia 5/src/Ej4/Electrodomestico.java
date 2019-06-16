/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author Fede
 */
public class Electrodomestico {
    //precio base, color, consumo energético (letras entre A y F) y peso

    protected float precioBase;
    protected float peso;
    protected String color;
    protected char consumoEnergetico;

    private final String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};

    private static final float PRECIO_BASE_DEFAULT = 100f;
    private static final float PESO_DEFAULT = 5.0f;

    private static final String COLOR_DEFAULT = "blanco";
    private static final char CONSUMO_ENERGETICO_DEFAULT = 'F';

    public Electrodomestico() {
        this(PRECIO_BASE_DEFAULT, PESO_DEFAULT, COLOR_DEFAULT, CONSUMO_ENERGETICO_DEFAULT);
    }

    public Electrodomestico(float nuevoPrecio, float nuevoPeso) {
        this(nuevoPrecio, nuevoPeso, COLOR_DEFAULT, CONSUMO_ENERGETICO_DEFAULT);
    }

    public Electrodomestico(float nuevoPrecio, float nuevoPeso, String nuevoColor, char consumoElec) {
        super();
        setPrecioBase(nuevoPrecio);
        setPeso(nuevoPeso);
        comprobarColor(nuevoColor);
        comprobarConsumoEnergetico(consumoElec);
    }

    private void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    private void setPeso(float peso) {
        this.peso = peso;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public float getPeso() {
        return peso;
    }

    private String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    /**
     * Comprueba que el color es correcto, sino lo es usa el color por defecto.
     *
     * @param letra
     */
    private void comprobarConsumoEnergetico(char letra) {
        if (letra < 'A' || letra > 'F') {
            letra = 'F';
        }
        setConsumoEnergetico(letra);
    }

    /**
     * comprueba que el color es correcto, sino lo es usa el color por defecto.
     *
     * @param color
     */
    private void comprobarColor(String color) {
        color = color.toLowerCase();
        int i = 0;
        while (i < COLORES_DISPONIBLES.length && !COLORES_DISPONIBLES[i].equalsIgnoreCase(color)) {
            i++;
        }
        if (i == COLORES_DISPONIBLES.length) {
            color = COLOR_DEFAULT;
        }
        setColor(color);
    }

    public float precioFinal() {
        float precioFinal = getPrecioBase();
        switch (getConsumoEnergetico()) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }

        float p = getPeso();
        if (p > 0 && p < 20) {
            precioFinal += 10;
        } else {
            if (p >= 20 && p < 50) {
                precioFinal += 50;
            } else {
                if (p >= 50 && p < 80) {
                    precioFinal += 80;
                } else {
                    precioFinal += 100;
                }
            }
        }
        return precioFinal;
    }
}
