/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author Fede
 */
public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
    
    

    public void avanzarSegundo() {
        if (segundo < 59) {
            segundo++;
        } else {
            segundo = 0;
            if (minuto < 59) {
                minuto++;
            } else {
                minuto = 0;
                if (hora < 23) {
                    hora++;
                } else {
                    hora = 0;
                }
            }
        }

    }

    public void retrocederSegundo() {
        if(segundo>0){
            segundo--;
        }else{
            segundo=59;
            if(minuto>0){
                minuto--;
            }else{
                minuto=59;
                if(hora> 0){
                    hora--;
                }else{
                    hora= 23;
                }
            }
        }
    }

    @Override
    public String toString() {
        String horaReloj= "";
        String minutoReloj= "";
        String segundoReloj= "";
        if (getHora()<10){
            horaReloj = "0"+getHora();
        }else{
            horaReloj = String.valueOf(getHora());
        }
        
        if (getMinuto()<10){
            minutoReloj = "0"+getMinuto();
        }else{
            minutoReloj = String.valueOf(getMinuto());
        }
        
        if (getSegundo()<10){
            segundoReloj = "0"+getSegundo();
        }else{
            segundoReloj = String.valueOf(getSegundo());
        }
        
        
        return horaReloj+':'+minutoReloj+':'+segundoReloj;
    }
    
    
}
