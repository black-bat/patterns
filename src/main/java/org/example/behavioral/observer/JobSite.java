package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed {
    List<String> vacancies = new ArrayList<>();
    List<Subscriber> subscribers = new ArrayList<>();

    public void addVacancies(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancies(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add((Subscriber) observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove((Subscriber) observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.vacancies);
        }
    }
}
