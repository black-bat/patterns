package org.example.behavioral.command;

public class Solution {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        User user = new User(new StartCommand(videoPlayer),
                new PauseCommand(videoPlayer),
                new RewindCommand(videoPlayer),
                new StopCommand(videoPlayer));
        user.startPlayer();
        user.pausePlayer();
        user.rewindPlayer();
        user.stopPlayer();
    }
}
