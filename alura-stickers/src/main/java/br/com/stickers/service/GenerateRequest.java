package br.com.stickers.service;

import br.com.stickers.model.ExtractIMDB;

public enum GenerateRequest {
  imdb("api.imdb.endpoint-mock", "api.imdb.key-mock"),
  nasa("api.nasa.endpoint-mock", "api.nasa.key-mock");

  private final String url;
  private final String key;

  ExtractIMDB value;

  GenerateRequest(String url, String key) {
    this.url = url;
    this.key = key;
  }

  public String formatedUrl() {
    ApiConfiguration api = new ApiConfiguration();
    return api.getValueOfProperties(this.url) + api.getValueOfProperties(this.key);
  }
}
