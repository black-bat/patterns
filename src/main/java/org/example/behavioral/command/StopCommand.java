package org.example.behavioral.command;

public class StopCommand implements Command {
    VideoPlayer videoPlayer;

    public StopCommand(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.stop();
    }
}
