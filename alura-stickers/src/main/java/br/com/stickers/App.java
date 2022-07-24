package br.com.stickers;

import br.com.stickers.controllers.CreateImage;
import br.com.stickers.model.ExtractIMDB;
import br.com.stickers.model.Image;
import br.com.stickers.service.GenerateRequest;
import br.com.stickers.service.Request;
import br.com.stickers.view.View;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {

  public static void main(String[] args) throws IOException {

    Request request = new Request();
    ExtractIMDB extract = new ExtractIMDB();
    View view = new View();
    String text = "HUE";

    String body = request.get(GenerateRequest.imdb.formatedUrl());
    List<Image> images = extract.extractImages(body);

    var createImage = new CreateImage();

    for (int i = 0; i < 3; i++) {

      Image image = images.get(i);
      InputStream inputStream = new URL(image.getUrl()).openStream();
      createImage.builder(inputStream, image.getTitle(), text);
      view.mostrarJson(images.get(i));
    }
  }
}
