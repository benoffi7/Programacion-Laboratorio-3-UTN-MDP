/**
 * Persona
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Persona() {
        this.nombre = new String("-");
        this.apellido = new String("-");
        this.email = new String("none@none.none");
        this.genero = '-';
    }

    public Persona(String nombre, String apellido, String email, char genero) {
        setNombre(nombre);
        setApellido(apellido);
        setEmail(email);
        setGenero(genero);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenero(char genero) {
        if (genero == 'M' || genero == 'F') {
            this.genero = genero;
        } else {
            System.out.println("\nGenero no permitido");
        }
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\nNombre: ");
        buffer.append(nombre);
        buffer.append("\nApellido: ");
        buffer.append(apellido);
        buffer.append("\nEmail: ");
        buffer.append(email);
        buffer.append("\nGenero: ");
        buffer.append(genero);

        return buffer.toString();
    }

}