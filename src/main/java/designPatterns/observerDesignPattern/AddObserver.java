package designPatterns.observerDesignPattern;

import javafx.util.Pair;

public class AddObserver extends Observer{

    public AddObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    protected void update() {
        Pair<Integer,Integer> myPair = subject.getData();
        int addition = myPair.getKey() + myPair.getValue();
        System.out.println("Addition :" + addition);
    }
}
