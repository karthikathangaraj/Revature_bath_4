package com.httpexamples;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;

public class HttpClientPostExample {
    public static void main(String[] args) {
        // Create an HttpClient instance
        HttpClient client = HttpClient.newHttpClient();

        // Define the JSON body for the POST request
        String jsonBody = "{\"title\": \"demo\", \"body\": \"httpdata\", \"userId\": 1234,\"Id\": 1234}";

        // Build the HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/")) // Target URL
                .header("Content-Type", "application/json") // Set content type to JSON
                .POST(BodyPublishers.ofString(jsonBody)) // Specify POST method and body
                .build();

        // Send the request and receive the response
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body) // Extract the response body
                .thenAccept(System.out::println) // Print the response body
                .join(); // Wait for the operation to complete
    }
}
