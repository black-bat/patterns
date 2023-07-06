package org.example.behavioral.observer;

public class Solution {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();
        jobSite.addVacancies("java");
        jobSite.addVacancies("JS");
        Observer subscriber1 = new Subscriber("Mike");
        Observer subscriber2 = new Subscriber("Elena");
        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);
        jobSite.addVacancies("c++");
        jobSite.removeVacancies("c++");
    }
}
