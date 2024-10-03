package com.httpexamples;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Getmethods {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts/?id=1123"))
				.GET().build();
		HttpResponse<String> res =client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(res.statusCode());
		System.out.println(res.body());
			   
	}

}
