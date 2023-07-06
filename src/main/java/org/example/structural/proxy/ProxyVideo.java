package org.example.structural.proxy;

public class ProxyVideo implements VideoFile {
    String url;
    RealVideo realVideo;

    public ProxyVideo(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        if (realVideo == null) {
            realVideo = new RealVideo(url);
        }
        realVideo.display();
    }
}
