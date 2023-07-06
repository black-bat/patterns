package org.example.behavioral.command;

public class StartCommand implements Command {
    VideoPlayer videoPlayer;

    public StartCommand(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.start();
    }
}
