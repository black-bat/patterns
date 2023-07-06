package org.example.behavioral.command;

public class VideoPlayer {
    void start(){
        System.out.println("старт");
    }
    void stop(){
        System.out.println("стоп");
    }
    void pause(){
        System.out.println("пауза");
    }
    void rewind(){
        System.out.println("перемотка");
    }
}
