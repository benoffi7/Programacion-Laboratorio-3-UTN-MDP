package Main;

public class Polideportivo implements InstalacionDeportiva, Edificio
{
    private int tipoDeInstalacion;
    private double superficieEdificio;
    private String nombre;
    public Polideportivo(){
        tipoDeInstalacion = 0;
        superficieEdificio = 0;
        nombre = "Unknown";
    }
    public Polideportivo(int tipoDeInstalacion, double superficieEdificio, String nombre){
        this.tipoDeInstalacion = tipoDeInstalacion;
        this.superficieEdificio = superficieEdificio;
        this.nombre = nombre;
    }
    
    public void setTipoDeInstalacion(int tipoDeInstalacion){this.tipoDeInstalacion = tipoDeInstalacion;}
    
    public void setSuperficieEdificio(double superficieEdificio){this.superficieEdificio = superficieEdificio;}
    
    public void setNombre(String nombre){this.nombre = nombre;}
    
    public int getTipoDeInstalacion(){return tipoDeInstalacion;}
    
    public double getSuperficieEdificio(){return superficieEdificio;}
    
    public String getNombre(){return nombre;}
    
    public String mostrarAtributos(){
        return "El polideportivo es de tipo: " + getTipoDeInstalacion() + " con una superficie de: " + getSuperficieEdificio()+" m2. Y su nombre es: "+getNombre();
    }
}