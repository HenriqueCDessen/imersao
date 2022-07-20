package br.com.inputimage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

public class Builder {

    public void starter(InputStream inputStream, String nomeArquivo) throws Exception {

        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        int largura = imagemOriginal.getHeight();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;

        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        graphics.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 64));
        graphics.setColor(Color.YELLOW);

        graphics.drawString("TOPZERA", 0, novaAltura - 100);

        ImageIO.write(novaImagem, "png", new File("alura-stickers/saida/" + nomeArquivo));

    }

}
