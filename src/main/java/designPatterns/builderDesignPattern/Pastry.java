package designPatterns.builderDesignPattern;

public class Pastry implements Item {
    @Override
    public String name() {
        return Pastry.class.getSimpleName();
    }

    @Override
    public float price() {
        return 20;
    }
}
