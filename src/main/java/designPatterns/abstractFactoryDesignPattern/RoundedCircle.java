package designPatterns.abstractFactoryDesignPattern;

public class RoundedCircle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a " + RoundedCircle.class.getSimpleName());
    }
}
