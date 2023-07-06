package org.example.behavioral.visitor;

public class BadArtist implements Artist{
    @Override
    public void create(Landscape landscape) {
        System.out.println("нарисовал кляксу на небе");
    }

    @Override
    public void create(Portrait portrait) {
        System.out.println("нарисовал кривой нос");
    }

    @Override
    public void create(StillLife stillLife) {
        System.out.println("нарисовал гнилые овощи");
    }
}
