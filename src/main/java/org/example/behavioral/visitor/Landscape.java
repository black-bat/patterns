package org.example.behavioral.visitor;

public class Landscape implements Picture {
    @Override
    public void createPicture(Artist artist) {
        artist.create(this);
    }
}
