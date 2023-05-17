package modelo;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String telefono;

    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }

    public Contacto(String nombre, String telefono) throws Exception
    {
        if (nombre.isEmpty())
        {
            throw new Exception("Nombre vacio");
        }
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre) && Objects.equals(telefono, contacto.telefono);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
