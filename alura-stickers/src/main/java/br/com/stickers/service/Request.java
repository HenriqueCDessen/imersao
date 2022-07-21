package br.com.stickers.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {
  public String get(String url) {

    try {
      return HttpClient.newHttpClient()
          .send(
              HttpRequest.newBuilder(URI.create(url)).GET().build(),
              HttpResponse.BodyHandlers.ofString())
          .body();
    } catch (IOException | InterruptedException ex) {
      throw new RuntimeException(ex);
    }
  }
}
