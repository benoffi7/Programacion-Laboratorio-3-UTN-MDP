package pakej;

/**
 * Password
 */
public class Password {

    private int longitud;
    private String contraseña;

    public Password() {
        longitud = 8;
        contraseña = "password";
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPswrd(longitud);
    }

    // *-------------------------------------

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @return the longitud
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * 
     * @return true si la contraseña cumple todos los parametros y "Es Fuerte"
     */
    public boolean esFuerte() {
        boolean bulean = false;
        int cuentaMayus = 0;
        int cuentaMinus = 0;
        int cuentaNums = 0;

        for (int i = 0; i < this.longitud; i++) {

            if (Character.isUpperCase(this.contraseña.charAt(i))) {
                cuentaMayus++;
            } else {
                cuentaMinus++;
            }

            if (Character.isDigit(this.contraseña.charAt(i))) {
                cuentaNums++;
            }
        }

        if (cuentaMayus > 2 && cuentaMinus > 1 && cuentaNums > 5) {
            bulean = true;
        }

        return bulean;
    }

    public void generarPswrd(int longitud) {
        int ascii;
        char valor;
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < longitud; i++) {
            ascii = (int) ((Math.random() * 100) + 33);
            do {
                if (ascii < 48) {
                    ascii += 15;
                }
                if (ascii > 57 && ascii < 65) {
                    ascii += 9;
                }
                if (ascii > 90 && ascii < 97) {
                    ascii += 8;
                }
                if(ascii > 122){
                    ascii -= 75;
                }
            } while ((ascii > 122));

            valor = (char) ascii;
            buffer.append(valor);
        }

        this.contraseña = buffer.toString();
    }

}