package br.com.stickers.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApiConfiguration {

  private static final String URL = "api.imdb.endpoint-moc";
  private static final String KEY = "api.imdb.key-moc";

  private static Properties getProperties() throws IOException {
    final Properties properties = new Properties();
    FileInputStream file = new FileInputStream("src/main/resources/application.properties");
    properties.load(file);
    return properties;
  }

  public String getUrl() throws IOException {
    return getProperties().getProperty(URL);
  }

  public String getKey() throws IOException {
    return getProperties().getProperty(KEY);
  }
}
