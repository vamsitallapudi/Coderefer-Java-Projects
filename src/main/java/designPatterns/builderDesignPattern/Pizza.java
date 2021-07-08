package designPatterns.builderDesignPattern;

public class Pizza implements Item {
    @Override
    public String name() {
        return Pizza.class.getSimpleName();
    }

    @Override
    public float price() {
        return 10;
    }
}
