package com.httpexamples;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class creatingurl {

	public static void main(String[] args) {
		HttpClient client=HttpClient.newHttpClient();
		HttpRequest request =HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts")).build();
		CompletableFuture<HttpResponse<String>> res=client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
				
	res.thenApply(HttpResponse::body)
	   .thenAccept(System.out::println)
	   .join();
	
	}

}
