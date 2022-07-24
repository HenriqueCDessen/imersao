package br.com.stickers.model;

import br.com.stickers.controllers.JsonParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtractIMDB implements ExtractImage {
  @Override
  public List<Image> extractImages(String json) {
    JsonParser parser = new JsonParser();
    List<Map<String, String>> response = parser.parse(json);
    List<Image> images = new ArrayList<>();

    for (Map<String, String> information : response) {
      String title = information.get("title");
      String url = information.get("image");

      var image = new Image(title, url);

      images.add(image);
    }

    return images;
  }
}
