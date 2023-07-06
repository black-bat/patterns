package org.example.behavioral.command;

public class User {
    Command start;
    Command pause;
    Command stop;
    Command rewind;

    public User(Command start, Command pause, Command stop, Command rewind) {
        this.start = start;
        this.pause = pause;
        this.rewind = rewind;
        this.stop = stop;
    }

    public void startPlayer() {
        start.execute();
    }

    public void stopPlayer() {
        stop.execute();
    }
    public void rewindPlayer() {
        rewind.execute();
    }
    public void pausePlayer() {
        pause.execute();
    }
}
