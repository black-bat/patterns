package org.example.behavioral.visitor;

public class GoodArtist implements Artist{
    @Override
    public void create(Landscape landscape) {
        System.out.println("нарисовал голубое небо");
    }

    @Override
    public void create(Portrait portrait) {
        System.out.println("нарисовал красивую женщину");
    }

    @Override
    public void create(StillLife stillLife) {
        System.out.println("нарисовал яблоки");
    }
}
