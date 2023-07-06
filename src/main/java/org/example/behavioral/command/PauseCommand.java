package org.example.behavioral.command;

public class PauseCommand implements Command {
    VideoPlayer videoPlayer;

    public PauseCommand(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.pause();
    }
}
