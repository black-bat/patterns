package org.example.behavioral.command;

public class RewindCommand implements Command {
    VideoPlayer videoPlayer;

    public RewindCommand(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void execute() {
        videoPlayer.rewind();
    }
}
