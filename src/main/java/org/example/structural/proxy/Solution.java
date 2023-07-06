package org.example.structural.proxy;

public class Solution {
    public static void main(String[] args) {
        //идет сразу загрузка файла
        VideoFile videoFile = new RealVideo("https://www.youtube.com/watch?v=vdNQrToX_EU");
        videoFile.display();
        //загрузка файла начинается только после вызова метода display
        VideoFile videoFile1=new ProxyVideo("https://www.youtube.com/watch?v=vdNQrToX_EU");
        videoFile1.display();
    }
}
