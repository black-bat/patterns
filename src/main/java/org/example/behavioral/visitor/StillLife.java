package org.example.behavioral.visitor;

public class StillLife implements Picture {
    @Override
    public void createPicture(Artist artist) {
        artist.create(this);
    }
}
