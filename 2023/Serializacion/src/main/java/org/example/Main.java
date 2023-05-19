package org.example;

import org.example.JSON.JsonGson;
import org.example.JSON.JsonJackson;
import org.example.Models.Persona;
import org.example.Serializacion.Serializar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Juan", "Perez", 25);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("1. Serializar y deserializar con .bin");
        System.out.println("2. Serializar y deserializar con .json y Jackson");
        System.out.println("3. Serializar y deserializar con .json y Gson");

        opcion = scanner.nextInt();

        switch (opcion){

            case 1:

                Serializar serializar = new Serializar();

                serializar.serializar(persona, "src/main/java/org/example/Serializacion/archivo.bin");

                Persona p = serializar.deserializar("src/main/java/org/example/Serializacion/archivo.bin");

                System.out.println(p);

                System.out.println(p.getNombre());

                break;

            case 2:

                JsonJackson jsonJackson = new JsonJackson();

                jsonJackson.serializar(persona, "src/main/java/org/example/JSON/datos.json");

                Persona pp = jsonJackson.deserializar("src/main/java/org/example/JSON/datos.json", Persona.class);

                System.out.println(pp);

                System.out.println(pp.getNombre());

                break;

            case 3:

                JsonGson jsonGson = new JsonGson();

                jsonGson.serializar(persona, "src/main/java/org/example/JSON/datosGson.json");

                Persona ppp = jsonGson.deserializar("src/main/java/org/example/JSON/datosGson.json", Persona.class);

                System.out.println(ppp);

                System.out.println(ppp.getNombre());

                break;

        }
    }
}