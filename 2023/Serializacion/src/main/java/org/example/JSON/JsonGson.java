package org.example.JSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.example.Models.Persona;


import java.io.*;

public class JsonGson {

    private final Gson gson = new Gson();
    public JsonGson(){}

    public <T> void serializar(T objeto, String pathJson) {

        File file = new File(pathJson);


        try {

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            gson.toJson(objeto, objeto.getClass(), bufferedWriter);

            bufferedWriter.close();

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public <T> T deserializar(String pathJson, Class<T> clase) {

        File file = new File(pathJson);

        T objeto;

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            objeto = gson.fromJson(bufferedReader, clase);

            bufferedReader.close();

            return objeto;

        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }
}
