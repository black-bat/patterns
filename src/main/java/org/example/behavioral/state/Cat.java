package org.example.behavioral.state;

public class Cat {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof SleepAllNight) {
            setActivity(new EatingFood());
        } else if (activity instanceof PlayGame) {
            setActivity(new SleepAllNight());
        } else if ((activity instanceof EatingFood)) {
            setActivity(new ReadingBook());
        } else if (activity instanceof ReadingBook) {
            setActivity(new PlayGame());
        }
    }
    public void justDoIt(){
        activity.justDoIt();
    }
}
