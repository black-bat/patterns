package org.example.behavioral.state;

public class Solution {
    public static void main(String[] args) {
        Activity activity = new SleepAllNight();
        Cat cat = new Cat();
        cat.setActivity(activity);
        for (int i = 0; i < 10; i++) {
            cat.justDoIt();
            cat.changeActivity();
        }
    }
}
