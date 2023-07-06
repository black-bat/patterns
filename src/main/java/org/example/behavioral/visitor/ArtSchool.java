package org.example.behavioral.visitor;

public class ArtSchool implements Picture {
    Picture[] pictures;

    public ArtSchool() {
        this.pictures = new Picture[]{
                new Landscape(),
                new StillLife(),
                new Portrait()
        };
    }

    @Override
    public void createPicture(Artist artist) {
        for (Picture picture : pictures) {
            picture.createPicture(artist);
        }
    }
}
