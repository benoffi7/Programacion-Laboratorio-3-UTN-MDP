package org.example.JSON;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Models.Persona;

public class JsonJackson {


    public JsonJackson() {}

    public <T> void serializar(T objeto, String pathJson) {

        File file = new File(pathJson);

        ObjectMapper mapper = new ObjectMapper();

        try {

            mapper.writeValue(file, objeto);

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public <T> T deserializar(String pathJson, Class<T> clase) {

        File file = new File(pathJson);

        ObjectMapper mapper = new ObjectMapper();

        T objeto;

        try {

            objeto = mapper.readValue(file, clase);

            return objeto;

        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }

}
