package Ej2;

public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;// (H hombre, M mujer)
    private float peso;
    private float altura;

    public Persona() {
        this("", 0, 'H', 0f, 0f);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0f, 0f);
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        super();
        setNombre(nombre);
        setEdad(edad);
        cargarSexo(sexo);
        generarDNI();

        setPeso(peso);
        setAltura(altura);
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    private void setDNI(String nuevoDNI) {
        DNI = nuevoDNI;
    }

    private void setSexo(char sex) {
        sexo = sex;
    }

    private char getSexo() {
        return sexo;
    }

    public void setPeso(float nuevoPeso) {
        peso = nuevoPeso;
    }

    public void setAltura(float nuevaAltura) {
        altura = nuevaAltura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    private void generarDNI() {
        StringBuilder dni = new StringBuilder();
        if (getSexo() == 'H') {
            dni.append('1');
        } else {
            dni.append('0');
        }
        for (int i = 0; i < 7; i++) {
            dni.append((int) (Math.random() * 9));
        }

        DNI = dni.toString();
    }

    public int calcularIMC() {
        int rta = 0;
        float imc = getPeso() / (getAltura() * getAltura());
        if (imc < 20f) {
            rta = -1;
        } else {
            if (imc > 25f) {
                rta = 1;
            }
        }
        return rta;
    }

    private void comprobarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'H') {
            setSexo(sexo);
        } else {
            setSexo('H');
        }
    }

    public void cargarSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public boolean esMayorDeEdad() {
        return (getEdad() >= 18);
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\nEdad: " + getEdad() + " años"
                + "\nDNI: " + getDNI() + "\nSexo: " + getSexo() + "\nPeso: " + getPeso() + "kg"
                + "\nAltura: " + getAltura() + "mts" + "\n";
    }

}
