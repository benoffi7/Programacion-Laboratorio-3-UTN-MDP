/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;



/**
 *
 * @author usuario
 */
public class Autor {    
    private String nombre;
    private String apellido;
    private String email;
    private char genero;
    
    public Autor(String nom, String ape,String mail,char sexo){
        nombre= nom;
        apellido = ape;
        setEmail(mail);
        setGenero(sexo);
    }

        
    public void setEmail(String mail){
        email = mail;
    }
    
    private void setGenero(char sexo){
        genero = sexo;
    }

    private String getNombre() {
        return nombre;
    }

    private String getApellido() {
        return apellido;
    }

    public String getNyA(){
        return getNombre()+" "+ getApellido();
    }
    
    public String getEmail() {
        return email;
    }

    public char getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Autor: "+ getNyA()+"\nEmail:"+ getEmail()+ "\n'"+getGenero()+"'";
    }
    
    
     
}
