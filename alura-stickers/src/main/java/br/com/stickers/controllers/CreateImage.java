package br.com.stickers.controllers;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class CreateImage {

  public void builder(InputStream inputStream, String nomeArquivo, String phrase) {

    try {
      BufferedImage originalImage = ImageIO.read(inputStream);
      int height = originalImage.getHeight() + 200;
      BufferedImage refactorImage =
          new BufferedImage(originalImage.getWidth(), height, BufferedImage.TRANSLUCENT);

      Graphics2D graphics = (Graphics2D) refactorImage.getGraphics();
      graphics.drawImage(originalImage, 0, 0, null);

      graphics.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 64));
      graphics.setColor(Color.YELLOW);
      graphics.drawString(phrase, 0, height - 100);

      ImageIO.write(
          refactorImage, "png", new File("alura-stickers/images/output/" + nomeArquivo + ".png"));
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
  }
}
