package com.darien.conversor.principal;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCient {
    public ConversorMonedas  main(String[] args) throws IOException, InterruptedException {
            String url = "https://v6.exchangerate-api.com/v6/59f94c26e8f32e1cb15b6a59/latest/USD";

            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = cliente
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            return gson.fromJson(response.body(), ConversorMonedas.class);

    }
}

