package org.example.JSON;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConsumoAPI {

    public static void main(String[] args) {

        try {

            // URL es una clase que representa una URL. En este caso, la URL de la API que queremos consumir.
            URL url = new URL("https://rickandmortyapi.com/api/character/?name=rick&status=alive");

            // HttpURLConnection es una clase que permite realizar una conexión HTTP.
            // openConnection() devuelve un objeto de tipo URLConnection, que es la clase padre de HttpURLConnection.
            // URLConnection es una clase abstracta que representa una conexión a una URL.
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // setRequestMethod() es un método de la clase HttpURLConnection que permite setear el método HTTP que se
            // va a utilizar.
            connection.setRequestMethod("GET");
            connection.connect();

            // getResponseCode() es un método de la clase HttpURLConnection que devuelve el código de respuesta HTTP.
            int responseCode = connection.getResponseCode();

            // Si el código de respuesta no es 200, se lanza una excepción. El código 200 significa que la petición
            // fue exitosa.
            if (responseCode != 200) {

                throw new RuntimeException("HttpResponseCode: " + responseCode);

            } else {

                StringBuilder response = new StringBuilder();

                // Scanner es una clase que permite leer datos de un flujo de entrada. En este caso, el flujo de entrada
                // es la respuesta de la API. El método openStream() de la clase URL devuelve un flujo de entrada.
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    response.append(scanner.nextLine());
                }

                scanner.close();

                System.out.println(response.toString());
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
