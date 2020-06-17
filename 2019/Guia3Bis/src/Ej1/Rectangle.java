/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

/**
 *
 * @author Fede
 */
public class Rectangle {

    private int ancho;
    private int altura;

    public Rectangle(){
        setAncho(1);
        setAltura(0);
    }
    
    public Rectangle( int nuevoAncho, int nuevaAltura){
        setAncho(nuevoAncho);
        setAltura(nuevaAltura);
    }
    
    public int getAncho(){
        return ancho;
    }
    
    public int getAltura(){
        return altura;
    }
            
    private void setAncho(int nuevo){
        ancho = nuevo;
    }
    
    private void setAltura(int nuevo){
        altura = nuevo;
    }
    
    public void cambiarAncho(int nuevo){
        ancho = nuevo;
    }
    
    public void cambiarAltura(int nuevo){
        altura = nuevo;
    }
    
    public float calculateArea() {
        return getAltura() * getAncho();
    }

    public float calculatePerimeter() {
        return (getAltura()*2) + (getAncho()*2);
    }

    @Override
    public String toString(){
        return "Ancho: "+ getAncho()+"\nAltura: "+getAltura();
       
    }
}
