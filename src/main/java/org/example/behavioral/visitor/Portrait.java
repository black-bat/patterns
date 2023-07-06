package org.example.behavioral.visitor;

public class Portrait implements Picture{
    @Override
    public void createPicture(Artist artist) {
        artist.create(this);
    }
}
