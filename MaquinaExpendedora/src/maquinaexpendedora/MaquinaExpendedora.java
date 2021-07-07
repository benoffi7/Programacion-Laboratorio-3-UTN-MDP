
package maquinaexpendedora;


public class MaquinaExpendedora {
    private double saldo = 0;
    private Double dineroIngresado;
    private Boleto boleto;
    private static int cantBoletos = 0;
    private boolean estado;
    
    public MaquinaExpendedora(){
        boleto = new Boleto(10.5, "Viaje Corta Distancia");
        estado = true;
    }
    
    public void ingresarDinero(Double dinero){
            dineroIngresado = dinero;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    
    public void terminarOperacion(){
        saldo += dineroIngresado - darVuelto();
        cantBoletos++;
    }
    
    public void ponerPrecio(Double precio){
        boleto.setPrecio(precio);
    }
    
    public void vaciarSaldo(){
        saldo = 0;
    }
    
    public Double obtenerSaldo(){
        return saldo;
    }
    
    public Double obtenerPrecio(){
        return boleto.getPrecio();
    }
    
    public String getBoleto(){
        return boleto.getPrecio() + "$ " +  boleto.getNombre();
    }
    
    public Double getDineroIngresado(){
        return dineroIngresado;
    }
    
    public boolean isCorrecto(){
        return dineroIngresado >= boleto.getPrecio();
    }
    
    public Double darVuelto(){
        return dineroIngresado - boleto.getPrecio();
    }
    
    public Double getSaldo(){
        return saldo;
    }
    
    public int getCantBoletos(){
        return cantBoletos;
    }
}
