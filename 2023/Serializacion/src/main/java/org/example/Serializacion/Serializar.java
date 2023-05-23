package org.example.Serializacion;

import org.example.Models.Persona;

import java.io.*;

public class Serializar{

    public Serializar(){}


    public <T> void serializar(T objeto, String pathArchivo){

        File file = new File(pathArchivo);

        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(objeto);

            oos.close();

        } catch (IOException e) {

            throw new RuntimeException(e);
            
        }
    }


    public <T> T deserializar(String pathArchivo){

        File file = new File(pathArchivo);

        T objeto = null;

        try {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

            Object aux = ois.readObject();

            objeto = (T) aux;

            ois.close();

            return objeto;

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
