package app;

/**
 * Hora
 */
public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    public Hora() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public Hora(int hora, int minuto, int segundo) {
        timeDiscrimination(hora, minuto, segundo);
    }

    private void timeDiscrimination(int hora, int minuto, int segundo) {
        // Hora correctTime = new Hora();
        if (!(hora < 0) && !(minuto < 0) && !(segundo < 0)) {
            while (!(hora < 24) || !(minuto < 60) || !(segundo < 60)) {
                if (hora > 24) {
                    hora = hora - 24;
                } else if (minuto > 60) {
                    minuto = minuto - 60;
                    hora++;
                } else if (segundo > 60) {
                    segundo = segundo - 60;
                    minuto++;
                }
            }
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void oneSecForward() {
        this.segundo++;
        timeDiscrimination(this.hora, this.minuto, this.segundo);
    }

    public void oneSecBackwards() {
        this.segundo--;
        timeDiscrimination(this.hora, this.minuto, this.segundo);
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("\n");
        if (hora < 10) {
            buffer.append("0");
        }
        buffer.append(hora + ":");
        if (minuto < 10) {
            buffer.append("0");
        }
        buffer.append(minuto + ":");
        if (segundo < 10) {
            buffer.append("0");
        }
        buffer.append(segundo);
        return buffer.toString();
    }

}