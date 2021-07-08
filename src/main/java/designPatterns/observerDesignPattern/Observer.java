package designPatterns.observerDesignPattern;

public abstract class Observer {
    protected Subject subject;
    protected abstract void update();
}
