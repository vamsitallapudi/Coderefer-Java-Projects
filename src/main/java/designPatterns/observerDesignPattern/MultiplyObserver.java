package designPatterns.observerDesignPattern;

import javafx.util.Pair;

public class MultiplyObserver extends Observer{

    public MultiplyObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    protected void update() {
        Pair<Integer,Integer> myPair = subject.getData();
        int multiplication = myPair.getKey() * myPair.getValue();
        System.out.println("Multiplication :" + multiplication);
    }
}
