
package Cajero;

public class Cuenta {
    
    private static String nombre;
    private static int edad;
    
    private static float saldo;
    
    //CONSTRUCTORES
    
    public Cuenta(){
        
        setSaldo(0);
    }
    
    public Cuenta(float c){
        
        setSaldo(c);
    }
    
    //Getters
    
    public static float getSaldo(){

        return saldo;
    }
    
    public static String getNombre(){
        
        return nombre;
    }
      
    //Setters
    
    public static void setSaldo(float saldoR){
        
        saldo=saldoR;
    }
    
    public static void setNombre(String nombreR){
    
        nombre=nombreR;
    }
    
    public static void setEdad(int edadR){
        
        edad=edadR;
    }
    
    //METODOS
    
    public static void ingresar(float c){
        
        saldo+=c;
    }
    
    public static void extraer(float c){
        
        saldo-=c;
    }
    
}