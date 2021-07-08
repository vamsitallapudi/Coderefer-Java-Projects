package designPatterns.observerDesignPattern;

import javafx.util.Pair;

public class DivisionObserver extends Observer{

    public DivisionObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    protected void update() {
        Pair<Integer,Integer> myPair = subject.getData();
        int division = myPair.getKey() / myPair.getValue();
        System.out.println("Division :" + division);
    }
}
