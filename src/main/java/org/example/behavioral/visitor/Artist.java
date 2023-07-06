package org.example.behavioral.visitor;

public interface Artist {
    public void create(Landscape landscape);
    public void create(Portrait portrait);
    public void create(StillLife stillLife);
}
