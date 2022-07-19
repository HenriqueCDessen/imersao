package br.com.stickers.view;

import br.com.stickers.model.JsonParser;
import java.util.List;
import java.util.Map;

public class View {
  public static final String TEXT_WHITE = "\u001B[37m";
  public static final String TEXT_GREEN = "\u001B[32m";

  public void mostrarJson(String json) {
    JsonParser parser = new JsonParser();
    List<Map<String, String>> listaDeFilmes = parser.parse(json);

    for (Map<String, String> filme : listaDeFilmes) {
      System.out.println(TEXT_GREEN + "Titulo: " + TEXT_WHITE + filme.get("title"));
      System.out.println(TEXT_GREEN + "Avaliação: " + TEXT_WHITE + filme.get("imDbRating"));
      System.out.println(TEXT_GREEN + "Imagem: " + filme.get("image") + "\n");
    }
  }
}
