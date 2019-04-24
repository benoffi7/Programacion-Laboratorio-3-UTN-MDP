package Clases;

import java.util.Formatter;

public class Hora {

    private int hora;     // 0...23
    private int minutos;  // 0...59
    private int segundos; // 0...59

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }


    public void aumentarSegundo(){

        this.segundos += 1;

        if(this.segundos == 60){
            this.segundos = 0;
            this.minutos += 1;

            if(this.minutos == 60){
                this.minutos = 0;
                this.hora += 1;

                if (this.hora == 24){
                    hora = 0;
                }
            }
        }

    }

    public void retrocederSegundo(){

        this.segundos -= 1;

        if(this.segundos == -1){
            this.segundos = 59;
            this.minutos -= 1;

            if(this.minutos == -1){
                this.minutos = 59;
                this.hora -= 1;

                if (this.hora == -1){
                    hora = 23;
                }
            }
        }

    }

    public String mostrar() {

        if (hora<10) {
            return "0" + getHora()+" : 0"+getMinutos()+" : 0"+getSegundos();
        }
        if(minutos<10){
            return getHora()+" : 0"+getMinutos()+" : "+getSegundos();
        }
        if(segundos<10 && segundos>-1){
            return getHora()+" : "+getMinutos()+" : 0"+getSegundos();
        }


        else{
            return getHora() + " : " + getMinutos() + " : " + getSegundos();
        }

    }


}
