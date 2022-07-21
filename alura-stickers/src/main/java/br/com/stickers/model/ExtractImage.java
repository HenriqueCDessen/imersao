package br.com.stickers.model;

import java.util.List;

public interface ExtractImage {
    List<Image> extractImages(String json);
}
