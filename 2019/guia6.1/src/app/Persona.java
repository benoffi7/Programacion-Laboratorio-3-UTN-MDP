package app;

/**
 * Persona
 */
public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        nombre = new String("");
        edad = 0;
        generaDNI();
        sexo = 'H';
        peso = 0;
        altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = new String(nombre);
        this.edad = edad;
        generaDNI();
        comprobarSexo(sexo);
        this.sexo = sexo;

        peso = 0;
        altura = 0;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = new String(nombre);
        this.edad = edad;
        generaDNI();
        comprobarSexo(sexo);
        this.sexo = sexo;
        
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        comprobarSexo(sexo);
        this.sexo = sexo;

    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calculaIMC() {
        int res = 404;
        if (this.peso != 0 && this.altura != 0) {
            if (peso / (altura * altura) < 20) {
                res = -1;
            } else if (peso / (altura * altura) >= 20 && peso / (altura * altura) <= 25) {
                res = 0;
            } else if (peso / (altura * altura) > 25) {
                res = 1;
            }
        }

        return res;
    }

    public boolean esMayorDeEdad() {
        boolean res = false;

        if (edad >= 18) {
            res = true;
        }

        return res;
    }

    private void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M' && sexo != 'h' && sexo != 'm') {
            this.sexo = 'H';
        }
    }

    public void generaDNI() {
        StringBuffer dni = new StringBuffer();

        for (int i = 0; i < 8; i++) {
            dni.append((int) (Math.random() * 10));
        }

        this.DNI = dni.toString();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("\nNombre: " + nombre);
        buffer.append("\nEdad: " + edad);
        buffer.append("\nDNI: " + DNI);
        buffer.append("\nSexo: " + sexo);
        if (peso != 0) {
            buffer.append("\nPeso: " + peso);
        }
        if (altura != 0) {
            buffer.append("\nAltura " + altura);
        }

        return buffer.toString();
    }

}