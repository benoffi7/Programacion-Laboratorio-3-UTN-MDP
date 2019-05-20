/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesEjemplo;

/**
 *
 * @author Fede
 */
public class EdificionOficinas implements IEdificio{
    private int cantOficinas;
    private double superficie;
    
    public EdificionOficinas(){
        setCantOficinas(0);
        setSuperficie(0d);
    }

    public EdificionOficinas(int cantOficinas, double superficie) {
        setCantOficinas(cantOficinas);
        setSuperficie(superficie);
    }
    
    
    private void setCantOficinas(int cant){
        cantOficinas = cant;
    }
    
    private void setSuperficie(double sup){
        superficie = sup;
    }
    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }

    public int getCantOficinas(){
        return cantOficinas;
    }
    @Override
    public String toString() {
        return "El edificio posee " + getCantOficinas() + " oficinas, posee una superficie de " + getSuperficieEdificio()+" metros cuadrados" ;
    }
   
}
