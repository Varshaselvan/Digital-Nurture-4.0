import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class HttpClientExample {
    public static void main(String[] args) {
        try {
            // Create HTTP Client
            HttpClient client = HttpClient.newHttpClient();

            // Build HTTP Request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.github.com"))
                    .GET()
                    .build();

            // Send Request and Receive Response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Print Response Status
            System.out.println("Response Status: " + response.statusCode());

            // Print Raw Response Body
            System.out.println("Raw Response Body: " + response.body());

            // Parse JSON using Gson
            JsonElement jsonElement = JsonParser.parseString(response.body());
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            // Extract and Print a Specific Field (e.g., GitHub API URL)
            System.out.println("GitHub API URL: " + jsonObject.get("current_user_url").getAsString());

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}