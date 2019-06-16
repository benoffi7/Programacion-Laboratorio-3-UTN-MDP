/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7;

import java.util.Scanner;

/**
 * Dar de alta y modificar vehículos 
 * Alquilar y devolver vehículos 
 * Establecer el resultado de la revisión técnica de un vehículo 
 * Listar el estado de la flota de vehículos 
 * Mostrar el historial de alquileres de un vehículo seleccionado de la flota
 *
 * @author usuario
 */
public class Test {

    private static Scanner teclado;
    
    public static void modificarVehiculo(Agencia a) {
        System.out.println("Ingrese la patente del auto a modificar");
        String patente=  teclado.next();
        
        Vehiculo temp= a.buscarVehiculo(patente);
        System.out.println("Ingrese el modelo del vehiculo");
        temp.setModelo(teclado.next());
        System.out.println("Ingrese la marca del vehiculo");
        temp.setMarca(teclado.next());
        System.out.println("Ingrese el año del vehiculo");
        temp.setAnio(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Ingrese el kilometraje del vehiculo");
        temp.setKilometraje(teclado.nextFloat());
        System.out.println("Ingrese el precio de alquiler por dia del vehiculo");
        temp.setPrecioAlquilerDiario(teclado.nextFloat());
                
        if(temp instanceof Utilitario){
            System.out.println("Ingrese la capacidad de carga del vehiculo");
            ((Utilitario)temp).setCarga(teclado.nextFloat());
        }
        
        System.out.println(temp.toString());
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        
        Agencia a = new Agencia();
        
        Vehiculo v1 = new Automovil("AAA111", "Bolksbaget", "Hyrulux", 2019, 2000f);
        Vehiculo v2 = new Utilitario("BBB222", "Toyota", "Corolla", 2018, 2500f, 25f);
        
        a.agregarVehiculo(v1.getPatente(), v1);
        a.agregarVehiculo(v2.getPatente(), v2);
        
        a.alquilarVehiculo("AAA111", "2/06/2019", "Juan Perez");
        
        System.out.println(a.listarEstadoVehiculos());
        Vehiculo temp = a.buscarVehiculo("AAA111");
        
        System.out.println("Historial de alquilado del vehiculo "+temp.getPatente());
        System.out.println(temp.retornarRegistroAlquilado());
        
        teclado.close();
    }
}
