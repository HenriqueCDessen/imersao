package br.com.stickers;

import br.com.stickers.service.ApiConfiguration;
import br.com.stickers.service.RequestMovie;
import br.com.stickers.view.View;

public class App {

  public static void main(String[] args) {

    RequestMovie request = new RequestMovie();
    ApiConfiguration api = new ApiConfiguration();

    try {
      String body = request.get(api.getUrl() + api.getKey());
      new View().mostrarJson(body);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}
