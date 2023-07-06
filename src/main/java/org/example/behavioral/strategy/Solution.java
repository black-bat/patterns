package org.example.behavioral.strategy;

public class Solution {
    public static void main(String[] args) {
        Activity activity = new SleepAllNight();
        Cat cat = new Cat();
        cat.setActivity(activity);
        cat.executeActivity();
        cat.setActivity(new PlayGame());
        cat.executeActivity();
        cat.setActivity(new EatingFood());
        cat.executeActivity();
        cat.setActivity(new ReadingBook());
        cat.executeActivity();
    }
}
