import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConsumoAPI
{
    public static String getInfo()
    {
        try
        {
            URL url = new URL("https://rickandmortyapi.com/api/character/?name=rick&status=alive");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != 200)
            {
                throw new RuntimeException("Codigo de error: "+responseCode);
            }
            else
            {
                StringBuilder stringBuilder = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext())
                {
                    stringBuilder.append(scanner.nextLine());
                }
                scanner.close();
                return stringBuilder.toString();
            }
        }
        catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }
        return "";
    }
}
