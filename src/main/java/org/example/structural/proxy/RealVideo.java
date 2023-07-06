package org.example.structural.proxy;

public class RealVideo implements VideoFile{
   private String url;

    public RealVideo(String url) {
        this.url = url;
        loadVideo();
    }

    public void loadVideo(){
       System.out.println("загружаем видео по ссылке "+url);
   }
    @Override
    public void display() {
        System.out.println("смотрим видео");
    }
}
