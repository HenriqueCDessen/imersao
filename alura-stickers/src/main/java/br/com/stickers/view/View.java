package br.com.stickers.view;

import br.com.stickers.model.Image;

public class View {
  public static final String TEXT_WHITE = "\u001B[37m";
  public static final String TEXT_GREEN = "\u001B[32m";

  public void mostrarJson(Image image) {

    System.out.println(TEXT_GREEN + "Titulo: " + image.getTitle() + TEXT_WHITE);
    System.out.println(TEXT_WHITE + "Imagem: " + image.getUrl() + TEXT_WHITE);
  }
}
