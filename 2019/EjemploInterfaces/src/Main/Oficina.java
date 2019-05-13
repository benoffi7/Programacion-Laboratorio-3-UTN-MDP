package Main;

public class Oficina implements Edificio
{
	  private int numeroOficinas;
	  private double superficieEdificio;
	    public Oficina(){
	      numeroOficinas = 0;
	      superficieEdificio = 0;
	    }
	    public Oficina(int numeroOficinas, double superficieEdificio){
	        this.numeroOficinas = numeroOficinas;
	        this.superficieEdificio = superficieEdificio;
	    }
	   
	    public void setSuperficieEdificio(double superficieEdificio){this.superficieEdificio = superficieEdificio;}
	    
	    public void setNumeroOficinas(int numeroOficinas){this.numeroOficinas = numeroOficinas;}
	   
	    public double getSuperficieEdificio(){return superficieEdificio;}
	   
	    public int getNumeroOficinas(){return numeroOficinas;}
	    
	    public String mostrarAtributos(){
	        return "La oficina tiene: " + getNumeroOficinas() + " oficinas y consta de "+getSuperficieEdificio()+" m2.";
	    }
	}