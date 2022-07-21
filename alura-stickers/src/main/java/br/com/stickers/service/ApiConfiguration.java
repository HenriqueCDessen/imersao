package br.com.stickers.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApiConfiguration {

  private static Properties getProperties() throws IOException {
    final Properties properties = new Properties();
    FileInputStream file = new FileInputStream("alura-stickers/src/main/resources/application.properties");
    properties.load(file);
    return properties;
  }

  public String getValueOfProperties(String key)  {
    try{
      return getProperties().getProperty(key);
    }catch (IOException ex){
      throw new RuntimeException(ex);
    }

  }
}
