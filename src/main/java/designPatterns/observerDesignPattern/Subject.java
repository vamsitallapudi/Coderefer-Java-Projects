package designPatterns.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;

public class Subject {

    List<Observer> observers = new ArrayList<>();
    private int first;
    private int second;

    public void setData(int first, int second) {
        this.first = first;
        this.second = second;
        notifyAllObservers();
    }

    public Pair<Integer, Integer> getData() {
        return new Pair<>(first,second);
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(Observer::update);
    }
}