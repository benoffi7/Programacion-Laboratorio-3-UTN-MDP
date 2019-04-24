package Clases;

public class Autor {

    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(String nombre, String apellido, String email, char genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public char getGenero() {
        return genero;
    }

    public String mostrarAutor(){
        return "\t.:AUTOR:."+
                "\nNombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEmail: "+getEmail()+
                "\nGenero: "+getGenero()+"\n";
    }


}
